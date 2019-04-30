import { Component, OnInit } from '@angular/core';
import {Item} from '../model/item';
import {BehaviorSubject} from 'rxjs';
import {ItemService} from '../service/item.service';
import {TypeItemService} from '../service/typeItem.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  itemList: Item[] = [];
  idItem: number;
  availableItems: Item[] =[];
  editedItem: Item;

  constructor(private itemService: ItemService,
              private typeItemService: TypeItemService,
              private route: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {
    this.availableItems = this.itemService.availableItems;

    this.idItem = +this.route.snapshot.params.idItem;

    console.log('typeItems ' + this.itemList);

    this.itemService.getAllItem().subscribe(items => this.itemList = items);

    this.itemService.findItem(this.idItem).subscribe(item => {this.editedItem = item;})
  }

}

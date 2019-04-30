import { Component, OnInit } from '@angular/core';
import {Item} from '../model/item';
import {BehaviorSubject} from 'rxjs';
import {ItemService} from '../service/item.service';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {

  itemList: Item[] = [];

  constructor(private itemService: ItemService) { }

  ngOnInit() {
    console.log('typeItems' + this.itemList);

    this.itemService.getAllItem().subscribe(items => this.itemList = items);
  }

}

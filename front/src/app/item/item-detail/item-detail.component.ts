import { Component, OnInit } from '@angular/core';
import {ItemService} from 'src/app/service/item.service';
import {Item} from 'src/app/model/item';
import {Router} from '@angular/router';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {

  itemList: Item[] = [];
  idItem: number;
  availableItems: Item[] =[];
  editedItem: Item;

  constructor(private itemService: ItemService,
              private router: Router) { }

  ngOnInit() {
    this.availableItems = this.itemService.availableItems;

    console.log('ItemList' + this.itemList);

    this.itemService.findItem(this.idItem).subscribe(item => {
      this.editedItem = item;
    })
  }

  // Vérifier si on est en édition ou en création
  onSave() {
    if (!this.idItem) {
      this.itemService.createItem(this.editedItem);
    } else {
      this.itemService.updateItem(this.editedItem);
    }
    this.router.navigate(['/item']);
  }

}

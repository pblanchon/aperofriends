import {Item} from './item';
import {Friend} from './friend';

export class Bucket {

  constructor(public idBucket: number,
              public buyer: Friend,
              public items: Item) {}
}

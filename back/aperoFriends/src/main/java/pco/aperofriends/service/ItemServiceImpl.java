package pco.aperofriends.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pco.aperofriends.model.Item;
import pco.aperofriends.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {

	private ItemRepository itemRepository;
	
	public ItemServiceImpl(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	@Override
	public List<Item> findAllItems(){
		return itemRepository.findAll();
	}
	
	@Override
	public Optional<Item> findFriendByIdItem(Integer idItem) {
		return itemRepository.findById(idItem);
	}
	
	@Override
    public Item createItem(Item newItem) {
        return itemRepository.save(newItem);
    }
	
	@Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}

package kr.dantae.rest.store.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.dantae.rest.entity.User;
import kr.dantae.rest.store.UserStore;



@Repository
public class UserStoreLogic implements UserStore {
	
	Map<String, User> userMap;
	
	public UserStoreLogic() {
		userMap = new HashMap<>();
	}

	@Override
	public String create(User newUser) {
		this.userMap.put(newUser.getId(), newUser);
		return newUser.getId();
	}

	@Override
	public void update(User newUser) {
		this.userMap.put(newUser.getId(), newUser);
	}

	@Override
	public void delete(String id) {
		this.userMap.remove(id);
	}

	@Override
	public User retrieve(String id) {
		return this.userMap.get(id);
	}

	@Override
	public List<User> retrieveAll() {
		this.userMap.values().stream().collect(Collectors.toList());
	}

}

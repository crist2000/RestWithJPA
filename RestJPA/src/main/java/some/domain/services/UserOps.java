package some.domain.services;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Service;

import some.domain.dto.User;

@Service
public class UserOps {
	
	Map <String,User> users = new TreeMap<String,User>();

	public UserOps() {
		User user = new User("1","Red","Bull",22);
		users.put(user.getId(), user);
		user = new User("2","Old","Crook",55);
		users.put(user.getId(), user);
	}
	
	public User getUser(String id){
		if (users.containsKey(id))
			return users.get(id);
		else
			return null;
	}
	
	public Map<String, User> getAll(){
		return users;
	}

}

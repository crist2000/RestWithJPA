package some.domain.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import some.domain.dto.User;
import some.domain.services.UserOps;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	UserOps uobj;

	@RequestMapping("/all")
	public Map<String,User> getAll (){
		return uobj.getAll();
	}
	
	@RequestMapping("{id}")
	public User getUser(@PathVariable("id") String id){
		return uobj.getUser(id);
	}
	
}

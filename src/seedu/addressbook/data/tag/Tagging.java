package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.*;

public class Tagging {

	private Person person;
	private Tag tag;
	private String operation;
	
	private static ArrayList<Tagging> allTags;
	
	public Tagging(Person person, Tag tag , String operation){
		this.person = person;
		this.tag = tag;
		this.operation = operation;
		allTags.add(this);
	}
	
	
	
	public static void addTag(Person person, Tag tag, String operation){
		new Tagging(person, tag, operation);
	}
	
	public static void removeTag(Person person, Tag tag, String operation){
		new Tagging(person, tag, operation);
	}
	
}

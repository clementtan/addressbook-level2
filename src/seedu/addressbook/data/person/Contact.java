package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	
    public String value;
    protected boolean isPrivate;

    public Contact(String contact, boolean isPrivate, 
    		String MESSAGE_CONTACT_CONSTRAINTS , String iden)throws IllegalValueException{
    	this.isPrivate = isPrivate;
        String trimmedContact = contact.trim();
        if(iden.equals("idenPhone")){
        	if (!Phone.isValidPhone(trimmedContact)) {
                throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
            }
        }else if(iden.equals("idenAddress")){
        	if (!Address.isValidAddress(trimmedContact)) {
                throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
            }
        }else if(iden.equals("idenEmail")){
        	if (!Email.isValidEmail(trimmedContact)) {
                throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
            }
        }
        
        this.value = trimmedContact;
    }
    
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
    
}

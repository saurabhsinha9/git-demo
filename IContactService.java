public class IContactService{
	public Contact addContact(Contact contact);
	public Contact modifyContact(Contact contact);
	public void deleteContact(int contactId);
	public Contact searchContact(int contactId);
	public List<Contact> getAllContacts();	
}

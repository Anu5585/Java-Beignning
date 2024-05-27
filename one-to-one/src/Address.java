import javax.persistence.*;

@Entity
public class Address {
 @Id @GeneratedValue(strategy=GenerationType.AUTO)
 private int addressId;
  private String house;
  private String city;
 @OneToOne(cascade= CascadeType.ALL)// if we don't specify @joincolumn
 @JoinColumn(name="person_personId")//it will name it author_author_id
  private Person person;

 public Address( String house, String city,Person person) {
  this.house = house;
  this.city = city;
  this.person = person;
 }

 public Address() {

 }

 public int getAddressId() {
  return addressId;
 }

 public void setAddressId(int addressId) {
  this.addressId = addressId;
 }

 public String getHouse() {
  return house;
 }

 public void setHouse(String house) {
  this.house = house;
 }

 public String getCity() {
  return city;
 }

 public void setCity(String city) {
  this.city = city;
 }
}

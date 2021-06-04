package hotel.management.system;

public class Faculty_Immutable {
	public final class Immutable {
		 final String  Number;
		 final String Name;
		 final String Code;
		 public Immutable(String Number, String Name, String Code) {
		 this.Number = Number;
		 this.Name = Name;
		 this.Code = Code;
		 }
		 public String getNumber() {
		 return Number;
		 }
		 public String getName() {
		 return Name;
		 }
		 public String getCode() {
		 return Code;
		 }
		 @Override
		 public String toString() {
		 return super.toString(); //To change body of generated methods, choose Tools | Templates.
		 }
		}

}

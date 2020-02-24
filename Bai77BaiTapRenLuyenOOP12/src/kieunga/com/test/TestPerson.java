package kieunga.com.test;

import java.util.ArrayList;

import kieunga.com.model.Man;
import kieunga.com.model.Person;
import kieunga.com.model.Woman;

public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person>dsPerson =new ArrayList<Person>();
		Person an=new Man();
		an.setFirstname("An");
		Person hong=new Woman();
		hong.setFirstname("Hồng");
		((Woman)hong).setWearingMakeup(true);
		dsPerson.add(an);
		dsPerson.add(hong);
		for(Person ps: dsPerson)
		{
			if(ps instanceof Man)
			{
				System.out.println(ps.getFirstname()+" là nam");
			}
			else if(ps instanceof Woman)
			{
				System.out.println(ps.getFirstname()+" là nữ");
			}
		}

	}

}

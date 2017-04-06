package Array_list;

import java.util.ArrayList;


public class Array_list {

	private String max_Attribute = "default";
	private Double max_IG = 0.0;
	private Integer Parent_value = 0;
	private Integer Class_value = 0;
	private Integer max_ID = 0;
	public ArrayList<ArrayList<String>> Data = new ArrayList<ArrayList<String>>();
	
	/* Constructor*/
	
	public  Array_list() {
		//super();
		this.max_Attribute = "default";
		this.max_IG = 0.0;
		this.Parent_value = 0;
		this.Class_value = 0;
		this.max_ID = 0;
	}
	
	/* Overloaded Constructor*/
	
	public Array_list(String max_Attribute, Double max_IG, Integer value, Integer max_ID) {
		//super();
		this.max_Attribute = max_Attribute;
		this.max_IG = max_IG;
		this.Parent_value = value;
		this.Class_value = value;
		this.max_ID = max_ID;
	}

	
	/* max_Attribute */

	public String get_max_Attribute() {
		return max_Attribute;
	}

	public void set_max_Attribute(String Attribute_ID) {
		this.max_Attribute = Attribute_ID;
	}

	
	/* max_IG */
	public Double get_max_IG() {
		return max_IG;
	}

	public void set_max_IG(Double IG) {
		this.max_IG = IG;
	}
	
	
	/* Parent value */
	public Integer get_Parent_value() {
		return Parent_value;
	}
	public void set_Parent_value(Integer value) {
		this.Parent_value = value;
	}
	
	/* Class value */
	public Integer get_Class_value() {
		return Class_value;
	}
	public void set_Class_value(Integer value) {
		this.Class_value = value;
	}
	
    /* max_ID */
	public void set_max_ID(Integer max_ID) {
		this.max_ID = max_ID;
	}
	
	public Integer get_max_ID() {
		return max_ID;
	}

	
	/* ArrayList */
	public ArrayList<ArrayList<String>> get_Array_list() {
		return Data;
	}

	public void set_Array_list(ArrayList<ArrayList<String>> input) {
		for (int i = 0; i < input.size(); i++)
			this.Data.add(input.get(i));
	}

	
	// Printing the data //
	public void print_Array_list() {

		StringBuilder sb = new StringBuilder();
		for (ArrayList<String> arrayList : Data) {
			for (String s : arrayList) {
				sb.append(s);
				sb.append('\t');
			}
			sb.append('\n');
		}
		String yourInfo = sb.toString();
		System.out.print(yourInfo);

	}


}
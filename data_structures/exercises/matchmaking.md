ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

Write a method that joins the two lists by matching one girl with one boy into a new list.
If someone has no pair, he/she should be the element of the list too.
Expected output: "Eve-Joe", "Ashley-Fred", ...

System.out.println(match(girls, boys));

package java__lab4;
//2.	Create a class Teacher which inherits all the properties of Staff. 
//To initialize all the property, use parent class constructor from child class.
class Teacher extends Staff{
    String post;
        Teacher(int id,String name,String address,String post){
            super(id, name, address);
            this.post=post;
        }
        Teacher(int id,String name,String address){
            super(id, name, address);
        }
        void display(){
            System.out.println("Id: "+id+"  Name: "+name+"  Address: "+address+"  Post: "+post);
        }
        //when solving for 2 remove the mthod dispplay so the display method from the parent class can be callled
        public static void main(String[]args){
            Staff staff=new Teacher(10, "Hemant", "Tinkune");
            staff.display();
        }

}

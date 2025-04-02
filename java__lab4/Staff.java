package java__lab4;
class Staff{
        int id;
        String name;
        String address;
        Staff(int id,String name,String address){
            this.id=id;
            this.name=name;
            this.address=address;
        }
        void display(){
            System.out.println("Id: "+id+"  Name: "+name+"  Address: "+address);
        }
    }


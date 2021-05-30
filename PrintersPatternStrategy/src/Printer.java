interface PrintType{
    public void print(int idDoc);
}
 class Printer {
    int id;
    PrintType printType;
    void print(int idDoc) {
         this.printType.print(idDoc);
     }

}
class Matrix implements PrintType {
   public void print(int idDoc){}
}
class Inkjet implements PrintType {
    public void print(int idDoc){}
}
class Laser implements PrintType {
    public void print(int idDoc){}
}
class MyAssert {

  void calculate (int a){
  assert a > 50:"no should be less than 50"; 
}
  public static void main (String ar[]){
   MyAssert ob = new MyAssert ();
   ob.calculate(60);
 }
}
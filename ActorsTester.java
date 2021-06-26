class ActorsTester{

public static void main(String a[]){

Actors actors=new Actors("Vijay Kumar","18 july 1983","Sandalwood","62nd National film award");
actors.printActorsDetails();
Actors actor=new Actors("Sushant Singh Rajput","21 january 1986","Bollywood","nominated for filmfare award");
actor.printActorsDetails();
Actors acto=new Actors("Dulquer Salman","28 july 1986","Mollywood","4 filmfare award");
acto.printActorsDetails();

Actors.entertainingFans();
}
}
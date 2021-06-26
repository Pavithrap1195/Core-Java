class FreedomFightersTester{

public static void main(String a[]){

FreedomFighters freedomfighters=new FreedomFighters();
freedomfighters.name="Bhagat Singh";
freedomfighters.bornOn=" September 1907";
freedomfighters.diedOn="23 March 1931";
freedomfighters.causeOfDeath="Execution by hanging";
System.out.println(freedomfighters.name+" was born on "+freedomfighters.bornOn+" and died on "+freedomfighters.diedOn+" , cause of death was "+freedomfighters.causeOfDeath);

FreedomFighters freedomfight=new FreedomFighters();
freedomfight.name="Subhash Chandra Bose";
freedomfight.bornOn=" 23 January 1897";
freedomfight.diedOn="18 August 1945";
freedomfight.causeOfDeath="Third degree burns from aircrash";
System.out.println(freedomfight.name+" was born on "+freedomfight.bornOn+" and died on "+freedomfight.diedOn+" , cause of death was "+freedomfight.causeOfDeath);

FreedomFighters freedom=new FreedomFighters();
freedom.name="Bal Ghangadhar Tilak";
freedom.bornOn=" 23 July 1856";
freedom.diedOn="1 August 1920";
freedom.causeOfDeath="illness";
System.out.println(freedom.name+" was born on "+freedom.bornOn+" and died on "+freedom.diedOn+" , cause of death was "+freedom.causeOfDeath);

FreedomFighters.independance();
}
}
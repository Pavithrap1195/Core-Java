class SoldiersTester{

public static void main(String a[]){

Soldiers soldiers=new Soldiers();
soldiers.branch="India Army";
soldiers.role="Land warfare";
soldiers.headquarters="New Delhi";
soldiers.founded="1 April 1895";
System.out.println(soldiers.branch+" role is for "+soldiers.role+" ,it's headquarters located in "+soldiers.headquarters+" founded on "+soldiers.founded);

Soldiers soldier=new Soldiers();
soldier.branch="India Navy";
soldier.role="Naval warfare";
soldier.headquarters="New Delhi";
soldier.founded=" 1612";
System.out.println(soldier.branch+" role is for "+soldier.role+" ,it's headquarters located in "+soldier.headquarters+" founded on "+soldier.founded);

Soldiers soldie=new Soldiers();
soldie.branch="India AirForce";
soldie.role="Aerial warfare";
soldie.headquarters="New Delhi";
soldie.founded="8 October 1932";
System.out.println(soldie.branch+" role is for "+soldie.role+" ,it's headquarters located in "+soldie.headquarters+" founded on "+soldie.founded);

Soldiers.nationalSecurity();
}
}
class SmartPhonesTester{

public static void main(String a[]){

SmartPhones smartphones=new SmartPhones();
smartphones.brandName="Realme";
smartphones.internalStorageInGb=64;
smartphones.batteryCapacityInMah=5000;
smartphones.operatingSystem="Android";
smartphones.processorBrand="Snapdragon";
System.out.println(smartphones.brandName+" has internal storage "+smartphones.internalStorageInGb+" GB , it's battery capacity is "+smartphones.batteryCapacityInMah+" mAh with  "+smartphones.operatingSystem+" operating system and processor brand of "+smartphones.processorBrand);

SmartPhones smartphone=new SmartPhones();
smartphone.brandName="Samsung";
smartphone.internalStorageInGb=128;
smartphone.batteryCapacityInMah=4000;
smartphone.operatingSystem="Android";
System.out.println(smartphone.brandName+" has internal storage "+smartphone.internalStorageInGb+" GB , it's battery capacity is "+smartphone.batteryCapacityInMah+" mAh with  "+smartphone.operatingSystem+" operating system and processor brand of "+smartphone.processorBrand);

SmartPhones smart=new SmartPhones();
smartphone.processorBrand="Exynos";
smart.brandName="Oppo";
smart.internalStorageInGb=64;
smart.batteryCapacityInMah=4000;
smart.operatingSystem="Android";
smart.processorBrand="Mediatek";
System.out.println(smart.brandName+" has internal storage "+smart.internalStorageInGb+" GB , it's battery capacity is "+smart.batteryCapacityInMah+" mAh with  "+smart.operatingSystem+" operating system and processor brand of "+smart.processorBrand);
 
SmartPhones.multitasking();
}
}
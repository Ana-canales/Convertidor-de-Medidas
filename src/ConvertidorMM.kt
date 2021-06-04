//Declaraciones de Variables
var cantConvertir :Double=0.00;
var opcion : Int =0;
var result : Double=0.00;
fun convertMILIMETROaCENTIMETRO(){

    result = cantConvertir / 10;
    println("Tu resultado de la conversion de mm -> cm es de: " +result);
}
fun convertMILIMETROaMETROS(){

    result = cantConvertir / 1000;
    println("Tu resultado de la conversion de mm -> mt es de: "+result);
}
fun convertMILIMETROaKILOMETRO(){

    result = cantConvertir / 1000000;
    println("Tu resultado de la conversion de mm -> km es de: " +result);
}
fun convertCENTIMETROaMILIMETRO(){

    result = cantConvertir * 10;
    println("Tu resultado de la conversion de cm -> mm es de: " + result );
}
fun convertMETROSaMILIMETRO(){

    result = cantConvertir * 1000;
    println("Tu resultado de la conversion de mt -> mm es de: " +result );
}
fun convertKILOMETROaMILIMETRO(){

    result = cantConvertir * 1000000;
    println("Tu resultado de la conversion de km -> mm es de: "+result );
}
fun main(){
    println("----------Convertidor de Unidades-------");
    println("1. mm -> cm");
    println("2. mm -> mt");
    println("3. mm -> km");
    println("4. cm -> mm");
    println("5. mt -> mm");
    println("6. km -> mm");
    println("Eliga la Opcion ");
    opcion = readLine()!!.toInt();
    println("Ingrese la cantidad que desea convertir");
    cantConvertir = readLine()!!.toDouble();
    when(opcion){
        1->convertMILIMETROaCENTIMETRO();
        2->convertMILIMETROaMETROS();
        3->convertMILIMETROaKILOMETRO();
        4->convertCENTIMETROaMILIMETRO();
        5->convertMETROSaMILIMETRO();
        6->convertKILOMETROaMILIMETRO();

    }

}
 class TrafficLightsThread extends Thread{ public
void wait(int x){
try{
Thread.sleep(x);
}
catch(Exception e){
System.out.println(e);
}}
public void run(){
System.out.println("Red light glows");
wait(100);
System.out.println("Red light off");
System.out.println("Orange light glows");
wait(100);
System.out.println("Orange light offs");
System.out.println("Green light glows");
wait(100);
System.out.println("Green light offs");
wait(300);
}
public static void main(String[] args){
TrafficLightsThread t=new TrafficLightsThread();
t.start();
}}

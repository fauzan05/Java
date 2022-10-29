import java.util.*;
public class Coepoe_word_puzzle {
    public static void main(String[] args) {
        boolean kondisi1 = true;
        while(kondisi1 == true){
        Scanner input = new Scanner(System.in);
        char opsi;
        String jawaban1,jawaban2,jawaban3;
        int nilai1 = 0,nilai2 = 0,nilai3 = 0;
        System.out.println("Coepoe Word Puzze");
        System.out.println("-----------------");
        System.out.println("Rules :");
        System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters.");
        System.out.println("2. Each level. You have 10 chances to answer correctly");
        System.out.println("3. To get through to next level, you have to score 70 points each level");
        System.out.println("Press Enter to Start");
        input.nextLine();
        boolean kondisi_lv1 = true;
        boolean kondisi_lv2 = true;
        boolean kondisi_lv3 = true;
        while(kondisi_lv1 == true){
        System.out.println("Level 1");
        System.out.println("-------");
        System.out.println("\td   e   t   t   l   i");
        for(int i=1; i<=10; i++){
            System.out.print(i + ". Your Answer : ");
            jawaban1 = input.next();
            switch(jawaban1){
                case "die" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "led" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "lei" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "let" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "lid" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "lie" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "lit" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tie" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "deli" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "diet" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "edit" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "idle" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "lied" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tide" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tied" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tile" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tilt" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tilde" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tiled" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "title" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "titled" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;
                case "tilted" :
                    nilai1 += 10;
                    System.out.println("#Right! Score : " + nilai1);
                    break;                    
            }
            if(jawaban1.length() < 3){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() >= 3){
                        break;
                    }
                }
            }else if(jawaban1.length() > 6){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() <= 6){
                        break;
                    }
            }
            }
            if(i<=10 && jawaban1.equalsIgnoreCase(jawaban1)){
                System.out.println("anda memasukkan karakter lebih dari 1");
            }
            if(i==10){
               System.out.println("You had answered " + i + " times with " + nilai1/10 + " right answers...");
               if(nilai1 < 70){
                   System.out.println("You Lose!!! Try Again...");
                   System.out.println("Do you want to retry? [y/t]?");
                   opsi = input.next().charAt(0);
                   switch (opsi) {
                case 'Y': //jika user menginput huruf Y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    nilai1 = 0;
                    kondisi_lv1 = true;
                    break;
                case 'y': //jika user menginput huruf y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    nilai1 = 0;
                    kondisi_lv1 = true;
                    break;
                case 'T': //jika user menginput huruf T, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv1 = false;
                    kondisi_lv2 = false;
                    kondisi_lv3 = false;
                    kondisi1 = false; 
                    break;
                case 't': //jika user menginput huruf t, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv1 = false;
                    kondisi_lv2 = false;
                    kondisi_lv3 = false;
                    kondisi1 = false;
                    break;
                default: //jika user tidak memasukkan dari semua case diatas, maka akan masuk ke while
                    while(true){
                        System.out.println("Please include a character y/t to try or end this game !"); 
                        System.out.println("Submit : ");
                        opsi = input.next().charAt(0); //menginput user kembali
                        if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir dan kembali ke default
                            break;
                        }else if(opsi == 'T' || opsi == 't'){//jika user memasukkan karakter T atau t, maka perulangan berakhir dan kembali ke default
                            break;
                        }
                    }
                    if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka program dimulai kembali
                            System.out.println("Game Start Again...");
                            nilai1 = 0;
                            kondisi_lv1 = true;
                        }else if(opsi == 'T' || opsi == 't'){ //jika user memasukkan karakter T atau t, maka program telah berakhir
                            System.out.println("Game Is End...");
                            kondisi_lv1 = false;
                            kondisi_lv2 = false;
                            kondisi_lv3 = false;
                            kondisi1 = false;
                        }
                    break;
            }
               }else if(nilai1 >= 70){
                   System.out.println("Correct Answers : ");
                    System.out.println("die     led     lei     let     lid     lie     lit     tie     deli    diet");
                    System.out.println("edit    idle    lied    tide    tied    tile    tilt    tilde   tiled   title");
                    System.out.println("tilted  titled");
                    System.out.println("Press Enter To Next Level");
                    input.nextLine();
                   input.nextLine();   
                   kondisi_lv1 = false;
               }
            }
        }        
        }
        
        while(kondisi_lv2 == true){
        System.out.println("Level 2");
        System.out.println("-------");
        System.out.println("\ts   e   c   a   e   n");
        for(int i=1; i<=10; i++){
            System.out.print(i + ". Your Answer : ");
            jawaban1 = input.next();
            switch(jawaban1){
                case "sec" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "can" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "cane" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "scan" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "scene" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "case" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "cease" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "see" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "seen" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "nesc" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
                case "ace" :
                    nilai2 += 10;
                    System.out.println("#Right! Score : " + nilai2);
                    break;
            }
            if(jawaban1.length() < 3){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() >= 3){
                        break;
                    }
                }
            }else if(jawaban1.length() > 6){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() <= 6){
                        break;
                    }
            }
            }
            if(i==10){
               System.out.println("You had answered " + i + " times with " + nilai2/10 + " right answers...");
               if(nilai2 < 70){
                   System.out.println("You Lose!!! Try Again...");
                   System.out.println("Do you want to retry? [y/t]?");
                   opsi = input.next().charAt(0);
                   switch (opsi) {
                case 'Y': //jika user menginput huruf Y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    kondisi_lv2 = true;
                    nilai2 = 0;
                    break;
                case 'y': //jika user menginput huruf y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    kondisi_lv2 = true;
                    nilai2 = 0;
                    break;
                case 'T': //jika user menginput huruf T, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv2 = false;
                    kondisi_lv3 = false;
                    kondisi1 = false; 
                    break;
                case 't': //jika user menginput huruf t, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv2 = false;
                    kondisi_lv3 = false;
                    kondisi1 = false;
                    break;
                default: //jika user tidak memasukkan dari semua case diatas, maka akan masuk ke while
                    while(true){
                        System.out.println("Please include a character y/t to try or end this game !"); 
                        System.out.println("Submit : ");
                        opsi = input.next().charAt(0); //menginput user kembali
                        if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir dan kembali ke default
                            break;
                        }else if(opsi == 'T' || opsi == 't'){//jika user memasukkan karakter T atau t, maka perulangan berakhir dan kembali ke default
                            break;
                        }
                    }
                    if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka program dimulai kembali
                            System.out.println("Game Start Again...");
                            nilai2 = 0;
                            kondisi_lv2 = true;
                        }else if(opsi == 'T' || opsi == 't'){ //jika user memasukkan karakter T atau t, maka program telah berakhir
                            System.out.println("Game Is End...");
                            kondisi_lv2 = false;
                            kondisi_lv3 = false;
                            kondisi1 = false;
                        }
                    break;
            }
               }else if(nilai1 >= 70){
                   System.out.println("Correct Answers : ");
                    System.out.println("sec     can     cane     scan     scene     case     cease     see     seen    nesc    ace");
                   System.out.println("Press Enter To Next Level");
                   input.nextLine();
                   input.nextLine();
                   kondisi_lv2 = false;
               }
            }
        }        
        }
        while(kondisi_lv3 == true){
        System.out.println("Level 3");
        System.out.println("-------");
        System.out.println("\th   k   r   n   e   o");
        for(int i=1; i<=10; i++){
            System.out.print(i + ". Your Answer : ");
            jawaban1 = input.next();
            switch(jawaban1){
                case "honk" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "honker" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "roe" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "ore" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "her" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "hen" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "reno" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "one" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "hore" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "hor" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "horn" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
                case "neo" :
                    nilai3 += 10;
                    System.out.println("#Right! Score : " + nilai3);
                    break;
            }
            if(jawaban1.length() < 3){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() >= 3){
                        break;
                    }
                }
            }else if(jawaban1.length() > 6){
                while(true){
                    System.out.println("Include min.3 max.6 character !");
                    System.out.print(i + ". Your Answer : ");
                    jawaban1 = input.next();
                    if(jawaban1.length() <= 6){
                        break;
                    }
            }
            }
            if(i==10){
               System.out.println("You had answered " + i + " times with " + nilai3/10 + " right answers...");
               if(nilai3 < 70){
                   System.out.println("You Lose!!! Try Again...");
                   System.out.println("Do you want to retry? [y/t]?");
                   opsi = input.next().charAt(0);
                   switch (opsi) {
                case 'Y': //jika user menginput huruf Y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    kondisi_lv3 = true;
                    nilai3 = 0;
                    break;
                case 'y': //jika user menginput huruf y, maka kondisi akan bernilai true
                    System.out.println("Game Start Again...");
                    kondisi_lv3 = true;
                    nilai3 = 0;
                    break;
                case 'T': //jika user menginput huruf T, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv3 = false;
                    kondisi1 = false; 
                    break;
                case 't': //jika user menginput huruf t, maka kondisi akan bernilai false
                    System.out.println("Game Is End...");
                    kondisi_lv3 = false;
                    kondisi1 = false;
                    break;
                default: //jika user tidak memasukkan dari semua case diatas, maka akan masuk ke while
                    while(true){
                        System.out.println("Please include a character y/t to try or end this game !"); 
                        System.out.println("Submit : ");
                        opsi = input.next().charAt(0); //menginput user kembali
                        if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir dan kembali ke default
                            break;
                        }else if(opsi == 'T' || opsi == 't'){//jika user memasukkan karakter T atau t, maka perulangan berakhir dan kembali ke default
                            break;
                        }
                    }
                    if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka program dimulai kembali
                            System.out.println("Game Try Again...");
                            nilai3 = 0;
                            kondisi_lv3 = true;
                        }else if(opsi == 'T' || opsi == 't'){ //jika user memasukkan karakter T atau t, maka program telah berakhir
                            System.out.println("Game Is End...");
                            kondisi_lv3 = false;
                            kondisi1 = false;
                        }
                    break;
            }
               }else if(nilai1 >= 70){
                   int total_score = nilai1+nilai2+nilai3;
                   System.out.println("Correct Answers : ");
                    System.out.println("honk     honker     roe     ore     her    hen    reno    one    hore   hor   horn");
                   System.out.println("Press Enter To Show Result");
                   input.nextLine();
                   input.nextLine();
                   System.out.println("Overall Score : " + total_score);
                    System.out.println("You Win !!!");
                    System.out.println("Press Enter To Exit");
                    input.nextLine();
                   kondisi_lv3 = false;
                   kondisi1 = false;
               }
            }
        }        
        }
            
        
        }
    }
}

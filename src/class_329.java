
// $FF: renamed from: kp
public final class class_329 {

   // $FF: renamed from: y int
   static final int field_3850 = 1;
   // $FF: renamed from: v int
   static final int field_3851 = 14;
   // $FF: renamed from: f java.lang.String
   static final String field_3852 = "passwordchoice.ws";


   // $FF: renamed from: ag (int, boolean) java.lang.String
   public static String method_5820(int var0, boolean var1) {
      return var1 && var0 >= 0?class_90.method_1604(var0, 10, var1, (byte)-128):Integer.toString(var0);
   }

   // $FF: renamed from: g (java.lang.CharSequence[], int, int) java.lang.String
   public static String method_5821(CharSequence[] var0, int var1, int var2) {
      if(0 == var2) {
         return "";
      } else if(1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null?"null":var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if(var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if(var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   // $FF: renamed from: aa (java.lang.String) java.lang.String
   public static String method_5822(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if(2 == var3 || Character.isUpperCase(var5)) {
            var5 = class_359.method_6292(var5, 992571620);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(46 != var5 && var5 != 63 && var5 != 33) {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   // $FF: renamed from: k (java.lang.CharSequence) boolean
   public static boolean method_5823(CharSequence var0) {
      return class_36.method_398(var0, 10, true, -387650050);
   }

   // $FF: renamed from: m (java.lang.CharSequence) boolean
   public static boolean method_5824(CharSequence var0) {
      return class_36.method_398(var0, 10, true, -387650050);
   }

   // $FF: renamed from: w (java.lang.CharSequence, int, boolean) boolean
   static boolean method_5825(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= -562710617) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(0 == var7) {
               if(-1306696530 == var8) {
                  var3 = true;
                  continue;
               }

               if(313045259 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 1228097910 && var8 <= 186771290) {
               var10 = var8 - 55;
            } else {
               if(var8 < -310207054 || var8 > 122) {
                  return false;
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               return false;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: z (java.lang.CharSequence, int, boolean) boolean
   static boolean method_5826(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 2022840443) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(0 == var7) {
               if(-474751089 == var8) {
                  var3 = true;
                  continue;
               }

               if(1214130491 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > -1149904892) {
                  return false;
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               return false;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: af (char) boolean
   public static boolean method_5827(char var0) {
      return var0 >= 48 && var0 <= -1767372952 || var0 >= 684282101 && var0 <= 90 || var0 >= -2113406805 && var0 <= 122;
   }

   // $FF: renamed from: t (java.lang.CharSequence, int, boolean) boolean
   static boolean method_5828(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(0 == var7) {
               if(45 == var8) {
                  var3 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= -1898126160 && var8 <= -1785948686) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 825207512 || var8 > 122) {
                  return false;
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               return false;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: al (java.lang.CharSequence, int, boolean) int
   public static int method_5829(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= -1855927669) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(283337794 == var8) {
                  var3 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= -1988119603 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: bd (java.lang.CharSequence) java.lang.String
   public static String method_5830(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = 42;
      }

      String var1 = new String(var3);
      return var1;
   }

   // $FF: renamed from: bt (java.lang.CharSequence) java.lang.String
   public static String method_5831(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = 42;
      }

      String var1 = new String(var3);
      return var1;
   }

   // $FF: renamed from: ab (java.lang.CharSequence, int, boolean) int
   public static int method_5832(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= -431844030) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(1539136325 == var8) {
                  var3 = true;
                  continue;
               }

               if(-329324443 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= -1809887221) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= -1600126040) {
               var10 = var8 - 55;
            } else {
               if(var8 < -1704761943 || var8 > 289197687) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: ap (java.lang.CharSequence, int, boolean) int
   public static int method_5833(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(45 == var8) {
                  var3 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 65 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: av (java.lang.CharSequence) int
   public static int method_5834(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class_263.method_4995(var0.charAt(var3), (byte)41);
      }

      return var2;
   }

   // $FF: renamed from: <init> () void
   class_329() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "kp.<init>(" + ')');
      }
   }

   // $FF: renamed from: ad (java.lang.CharSequence, int, boolean) int
   public static int method_5836(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= -1159678031) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(45 == var8) {
                  var3 = true;
                  continue;
               }

               if(1593413422 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 48 && var8 <= 57) {
               var10 = var8 - 48;
            } else if(var8 >= 1170106839 && var8 <= 90) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: ai (int, boolean) java.lang.String
   public static String method_5837(int var0, boolean var1) {
      return var1 && var0 >= 0?class_90.method_1604(var0, 10, var1, (byte)-127):Integer.toString(var0);
   }

   // $FF: renamed from: bu (char) boolean
   public static boolean method_5838(char var0) {
      return var0 >= 32 && var0 <= 1540271744?true:(var0 >= -556813378 && var0 <= 255?true:var0 == 8364 || var0 == 338 || 8212 == var0 || 1525731419 == var0 || 376 == var0);
   }

   // $FF: renamed from: at (char) boolean
   public static boolean method_5839(char var0) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   // $FF: renamed from: ax (int, boolean) java.lang.String
   public static String method_5840(int var0, boolean var1) {
      return var1 && var0 >= 0?class_90.method_1604(var0, 10, var1, (byte)-127):Integer.toString(var0);
   }

   // $FF: renamed from: as (int, int, boolean) java.lang.String
   static String method_5841(int var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; 0 != var4; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = 43;

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if(var8 >= 10) {
                  var5[var6] = (char)(87 + var8);
               } else {
                  var5[var6] = (char)(48 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: aj (int, int, boolean) java.lang.String
   static String method_5842(int var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; 0 != var4; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = 43;

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if(var8 >= 10) {
                  var5[var6] = (char)(87 + var8);
               } else {
                  var5[var6] = (char)(48 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: am (int, int, boolean) java.lang.String
   static String method_5843(int var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         if(var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; 0 != var4; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = 43;

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if(var8 >= 10) {
                  var5[var6] = (char)(87 + var8);
               } else {
                  var5[var6] = (char)(48 + var8);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: az (java.lang.CharSequence) int
   public static int method_5844(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + class_263.method_4995(var0.charAt(var3), (byte)23);
      }

      return var2;
   }

   // $FF: renamed from: q (java.lang.CharSequence) int
   public static int method_5845(CharSequence var0) {
      return class_176.method_3747(var0, 10, true, (byte)-34);
   }

   // $FF: renamed from: ac (char) boolean
   public static boolean method_5846(char var0) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   // $FF: renamed from: ar (int, boolean) java.lang.String
   public static String method_5847(int var0, boolean var1) {
      return var1 && var0 >= 0?class_90.method_1604(var0, 10, var1, (byte)-128):Integer.toString(var0);
   }

   // $FF: renamed from: ah (char) boolean
   public static boolean method_5848(char var0) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   // $FF: renamed from: ao (char) boolean
   public static boolean method_5849(char var0) {
      return var0 >= 65 && var0 <= 90 || var0 >= 97 && var0 <= 122;
   }

   // $FF: renamed from: aq (char) boolean
   public static boolean method_5850(char var0) {
      return var0 >= -1993696560 && var0 <= 57;
   }

   // $FF: renamed from: aw (char) boolean
   public static boolean method_5851(char var0) {
      return var0 >= 48 && var0 <= 1979433707;
   }

   // $FF: renamed from: i (java.lang.CharSequence) int
   public static int method_5852(CharSequence var0) {
      return class_176.method_3747(var0, 10, true, (byte)-18);
   }

   // $FF: renamed from: bm (char) boolean
   public static boolean method_5853(char var0) {
      return var0 >= -1055186738 && var0 <= 126?true:(var0 >= 160 && var0 <= -1268624589?true:var0 == 668203432 || var0 == 338 || -1961427854 == var0 || 619618070 == var0 || -1866356386 == var0);
   }

   // $FF: renamed from: ay (java.lang.String) java.lang.String
   public static String method_5854(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if(2 == var3 || Character.isUpperCase(var5)) {
            var5 = class_359.method_6292(var5, 1766168404);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(46 != var5 && var5 != -831070212 && var5 != 33) {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   // $FF: renamed from: ae (java.lang.CharSequence, int, boolean) int
   public static int method_5855(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(var7 == 0) {
               if(-341792035 == var8) {
                  var3 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= -620993994 && var8 <= -644611083) {
               var10 = var8 - 48;
            } else if(var8 >= 577025470 && var8 <= -1383805785) {
               var10 = var8 - 55;
            } else {
               if(var8 < 845987950 || var8 > -91784241) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               throw new NumberFormatException();
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if(!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: au (java.lang.String) java.lang.String
   public static String method_5856(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if(2 == var3 || Character.isUpperCase(var5)) {
            var5 = class_359.method_6292(var5, 3859402);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(46 != var5 && var5 != 63 && var5 != 33) {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   // $FF: renamed from: an (java.lang.String) java.lang.String
   public static String method_5857(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if(0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if(2 == var3 || Character.isUpperCase(var5)) {
            var5 = class_359.method_6292(var5, 1592322228);
         }

         if(Character.isLetter(var5)) {
            var3 = 0;
         } else if(1125580499 != var5 && var5 != 63 && var5 != 33) {
            if(Character.isSpaceChar(var5)) {
               if(var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   // $FF: renamed from: a (java.lang.CharSequence[], int, int) java.lang.String
   public static String method_5858(CharSequence[] var0, int var1, int var2) {
      if(0 == var2) {
         return "";
      } else if(1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null?"null":var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if(var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if(var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   // $FF: renamed from: h (java.lang.CharSequence, int, boolean) boolean
   static boolean method_5859(CharSequence var0, int var1, boolean var2) {
      if(var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if(0 == var7) {
               if(45 == var8) {
                  var3 = true;
                  continue;
               }

               if(43 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if(var8 >= 2082223795 && var8 <= -176741491) {
               var10 = var8 - 48;
            } else if(var8 >= 828597312 && var8 <= -1051162414) {
               var10 = var8 - 55;
            } else {
               if(var8 < 97 || var8 > -1902406995) {
                  return false;
               }

               var10 = var8 - 87;
            }

            if(var10 >= var1) {
               return false;
            }

            if(var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if(var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   // $FF: renamed from: bq (java.lang.CharSequence) java.lang.String
   public static String method_5860(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = 42;
      }

      String var1 = new String(var3);
      return var1;
   }

   // $FF: renamed from: x (java.lang.CharSequence) boolean
   public static boolean method_5861(CharSequence var0) {
      return class_36.method_398(var0, 10, true, -387650050);
   }

   // $FF: renamed from: bl (char) boolean
   public static boolean method_5862(char var0) {
      return var0 >= 32 && var0 <= -47055482?true:(var0 >= 160 && var0 <= 255?true:var0 == 801105837 || var0 == 180349232 || 8212 == var0 || 1720081944 == var0 || 823067710 == var0);
   }

   // $FF: renamed from: bv (char) boolean
   public static boolean method_5863(char var0) {
      return var0 >= 32 && var0 <= -1774052804?true:(var0 >= -410121943 && var0 <= 255?true:var0 == 8364 || var0 == 338 || 8212 == var0 || 339 == var0 || 1450776542 == var0);
   }

   // $FF: renamed from: ak (char) boolean
   public static boolean method_5864(char var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 1582281266 && var0 <= 1862164872 || var0 >= 97 && var0 <= -1653462249;
   }

   // $FF: renamed from: ij (io[], int, int, int, int, int, int, int, int, int) void
   static final void method_5865(class_37[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         class_65.method_694(var2, var3, var4, var5);
         class_70.method_968();

         for(int var10 = 0; var10 < var0.length; ++var10) {
            if(var9 != -1945038256) {
               throw new IllegalStateException();
            }

            class_37 var11 = var0[var10];
            if(null == var11) {
               if(var9 != -1945038256) {
                  throw new IllegalStateException();
               }
            } else {
               if(var1 != var11.field_152 * -1338646279) {
                  if(var9 != -1945038256) {
                     return;
                  }

                  if(var1 != -1412584499) {
                     continue;
                  }

                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(var11 != client.field_1590) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               int var12;
               if(-1 == var8) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  client.field_1695[257317803 * client.field_1646] = 1347538309 * var11.field_114 + var6;
                  client.field_1518[client.field_1646 * 257317803] = var11.field_115 * -2036682047 + var7;
                  client.field_1539[client.field_1646 * 257317803] = 1163271639 * var11.field_104;
                  client.field_1632[257317803 * client.field_1646] = var11.field_117 * -571887853;
                  var12 = (client.field_1646 += 1865533187) * 257317803 - 1;
               } else {
                  var12 = var8;
               }

               var11.field_240 = var12 * 1140363989;
               var11.field_89 = -573155387 * client.field_1425;
               if(var11.field_100) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(class_76.method_1197(var11, 2130552221)) {
                     if(var9 != -1945038256) {
                        return;
                     }
                     continue;
                  }
               }

               if(var11.field_207 * -1245218361 > 0) {
                  class_291.method_5295(var11, 1084146758);
               }

               int var13 = var6 + var11.field_114 * 1347538309;
               int var14 = -2036682047 * var11.field_115 + var7;
               int var15 = 225521737 * var11.field_132;
               int var16;
               int var17;
               if(client.field_1590 == var11) {
                  if(var9 != -1945038256) {
                     return;
                  }

                  if(-1412584499 != var1 && !var11.field_96) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     class_117.field_1306 = var0;
                     class_44.field_328 = 1392713845 * var6;
                     class_168.field_2102 = -471433507 * var7;
                     continue;
                  }

                  if(client.field_1601) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     if(client.field_1595) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var16 = class_131.field_1722 * -678881683;
                        var17 = 1903378733 * class_131.field_1703;
                        var16 -= -653830947 * client.field_1592;
                        var17 -= client.field_1445 * 1055501491;
                        if(var16 < client.field_1516 * 1941546241) {
                           var16 = 1941546241 * client.field_1516;
                        }

                        if(var16 + 1163271639 * var11.field_104 > client.field_1516 * 1941546241 + client.field_1591.field_104 * 1163271639) {
                           var16 = client.field_1591.field_104 * 1163271639 + 1941546241 * client.field_1516 - 1163271639 * var11.field_104;
                        }

                        if(var17 < client.field_1597 * -356014141) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           var17 = client.field_1597 * -356014141;
                        }

                        if(-571887853 * var11.field_117 + var17 > -571887853 * client.field_1591.field_117 + -356014141 * client.field_1597) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           var17 = -356014141 * client.field_1597 + client.field_1591.field_117 * -571887853 - -571887853 * var11.field_117;
                        }

                        var13 = var16;
                        var14 = var17;
                     }
                  }

                  if(!var11.field_96) {
                     if(var9 != -1945038256) {
                        return;
                     }

                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if(2 == var11.field_103 * 1659206769) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else {
                  int var10000;
                  if(var11.field_103 * 1659206769 == 9) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     var20 = var13;
                     var21 = var14;
                     var22 = var13 + 1163271639 * var11.field_104;
                     var23 = var14 + -571887853 * var11.field_117;
                     if(var22 < var13) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var20 = var22;
                        var22 = var13;
                     }

                     if(var23 < var14) {
                        if(var9 != -1945038256) {
                           return;
                        }

                        var21 = var23;
                        var23 = var14;
                     }

                     ++var22;
                     ++var23;
                     var16 = var20 > var2?var20:var2;
                     if(var21 > var3) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var21;
                     } else {
                        var10000 = var3;
                     }

                     var17 = var10000;
                     if(var22 < var4) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var22;
                     } else {
                        var10000 = var4;
                     }

                     var18 = var10000;
                     if(var23 < var5) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var23;
                     } else {
                        var10000 = var5;
                     }

                     var19 = var10000;
                  } else {
                     var20 = var13 + var11.field_104 * 1163271639;
                     var21 = var11.field_117 * -571887853 + var14;
                     if(var13 > var2) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var13;
                     } else {
                        var10000 = var2;
                     }

                     var16 = var10000;
                     if(var14 > var3) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var14;
                     } else {
                        var10000 = var3;
                     }

                     var17 = var10000;
                     if(var20 < var4) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var20;
                     } else {
                        var10000 = var4;
                     }

                     var18 = var10000;
                     if(var21 < var5) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var10000 = var21;
                     } else {
                        var10000 = var5;
                     }

                     var19 = var10000;
                  }
               }

               if(var11.field_100) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(var16 >= var18) {
                     continue;
                  }

                  if(var17 >= var19) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }
                     continue;
                  }
               }

               if(0 != -1245218361 * var11.field_207) {
                  if(var9 != -1945038256) {
                     return;
                  }

                  if(-1245218361 * var11.field_207 == 1336) {
                     if(var9 != -1945038256) {
                        return;
                     }

                     if(client.field_1431) {
                        var14 += 15;
                        class_183.field_2251.method_947("Fps:" + client.field_1382 * -1080528073, 1163271639 * var11.field_104 + var13, var14, 16776960, -1);
                        var14 += 15;
                        Runtime var48 = Runtime.getRuntime();
                        var21 = (int)((var48.totalMemory() - var48.freeMemory()) / 1024L);
                        var22 = 16776960;
                        if(var21 > 327680) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           if(!client.field_1417) {
                              var22 = 16711680;
                           }
                        }

                        class_183.field_2251.method_947("Mem:" + var21 + "k", var13 + var11.field_104 * 1163271639, var14, var22, -1);
                        var14 += 15;
                     }
                     continue;
                  }

                  if(1337 == var11.field_207 * -1245218361) {
                     if(var9 != -1945038256) {
                        return;
                     }

                     client.field_1566 = var13 * -1142166715;
                     client.field_1529 = var14 * -312881829;
                     class_158.method_3304(var13, var14, 1163271639 * var11.field_104, var11.field_117 * -571887853, 1213701936);
                     client.field_1495[var11.field_240 * 1408898685] = true;
                     class_65.method_694(var2, var3, var4, var5);
                     continue;
                  }

                  if(var11.field_207 * -1245218361 == 1338) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     class_103.method_1918(var11, var13, var14, var12, -1477565954);
                     class_65.method_694(var2, var3, var4, var5);
                     continue;
                  }

                  if(-1245218361 * var11.field_207 == 1339) {
                     class_124.method_2279(var11, var13, var14, var12, 425709195);
                     class_65.method_694(var2, var3, var4, var5);
                     continue;
                  }

                  if(var11.field_207 * -1245218361 == 1400) {
                     class_287.field_3278.method_6346(var13, var14, 1163271639 * var11.field_104, var11.field_117 * -571887853, client.field_1425 * -1702273423, -1017239320);
                  }

                  if(1401 == -1245218361 * var11.field_207) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     class_287.field_3278.method_6436(var13, var14, 1163271639 * var11.field_104, -571887853 * var11.field_117, (byte)-14);
                  }

                  if(-1245218361 * var11.field_207 == 1402) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     class_176.field_2181.method_3401(var13, -1702273423 * client.field_1425, -30085989);
                  }
               }

               if(1659206769 * var11.field_103 == 0) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(!var11.field_100 && class_76.method_1197(var11, 2130552221)) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     if(var11 != class_149.field_1893) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  if(!var11.field_100) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     if(var11.field_123 * 1974901921 > var11.field_125 * 1577090123 - -571887853 * var11.field_117) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var11.field_123 = 1039263083 * var11.field_125 - 567515955 * var11.field_117;
                     }

                     if(var11.field_123 * 1974901921 < 0) {
                        var11.field_123 = 0;
                     }
                  }

                  method_5865(var0, -1722455647 * var11.field_101, var16, var17, var18, var19, var13 - var11.field_122 * -1662391635, var14 - var11.field_123 * 1974901921, var12, -1945038256);
                  if(null != var11.field_233) {
                     if(var9 != -1945038256) {
                        return;
                     }

                     method_5865(var11.field_233, var11.field_101 * -1722455647, var16, var17, var18, var19, var13 - -1662391635 * var11.field_122, var14 - 1974901921 * var11.field_123, var12, -1945038256);
                  }

                  class_48 var32 = (class_48)client.field_1578.method_6523((long)(-1722455647 * var11.field_101));
                  if(var32 != null) {
                     class_256.method_4944(var32.field_353 * 897280301, var16, var17, var18, var19, var13, var14, var12, (byte)50);
                  }

                  class_65.method_694(var2, var3, var4, var5);
                  class_70.method_968();
               }

               if(!client.field_1675) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(!client.field_1636[var12]) {
                     if(var9 != -1945038256) {
                        return;
                     }

                     if(client.field_1633 * 568772133 <= 1) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }
               }

               if(0 == 1659206769 * var11.field_103 && !var11.field_100) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }

                  if(var11.field_125 * 1577090123 > var11.field_117 * -571887853) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     class_137.method_2972(var11.field_104 * 1163271639 + var13, var14, 1974901921 * var11.field_123, var11.field_117 * -571887853, 1577090123 * var11.field_125, (byte)126);
                  }
               }

               if(1659206769 * var11.field_103 == 1) {
                  if(var9 != -1945038256) {
                     throw new IllegalStateException();
                  }
               } else {
                  int var24;
                  int var27;
                  int var36;
                  int var38;
                  if(1659206769 * var11.field_103 == 2) {
                     var20 = 0;

                     for(var21 = 0; var21 < var11.field_113 * -16853095; ++var21) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        for(var22 = 0; var22 < 1593997171 * var11.field_112; ++var22) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           var23 = var13 + (var11.field_124 * -1116733639 + 32) * var22;
                           var24 = var14 + var21 * (32 + var11.field_169 * 354722393);
                           if(var20 < 20) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var23 += var11.field_97[var20];
                              var24 += var11.field_171[var20];
                           }

                           if(var11.field_227[var20] > 0) {
                              label1392: {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 label1393: {
                                    boolean var25 = false;
                                    boolean var26 = false;
                                    var27 = var11.field_227[var20] - 1;
                                    if(32 + var23 > var2 && var23 < var4) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       if(32 + var24 > var3) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          if(var24 < var5) {
                                             break label1393;
                                          }

                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }
                                       }
                                    }

                                    if(var11 != class_90.field_900) {
                                       break label1392;
                                    }

                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    if(-65004085 * client.field_1548 != var20) {
                                       break label1392;
                                    }

                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 class_67 var28;
                                 label1269: {
                                    if(client.field_1570 * -438265211 == 1) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       if(81340013 * class_178.field_2220 == var20) {
                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }

                                          if(1565845213 * class_100.field_1172 == var11.field_101 * -1722455647) {
                                             if(var9 != -1945038256) {
                                                return;
                                             }

                                             var28 = class_271.method_5060(var27, var11.field_228[var20], 2, 0, 2, false, 346273568);
                                             break label1269;
                                          }
                                       }
                                    }

                                    var28 = class_271.method_5060(var27, var11.field_228[var20], 1, 3153952, 2, false, 768816682);
                                 }

                                 if(null != var28) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    if(var11 == class_90.field_900 && var20 == -65004085 * client.field_1548) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       var36 = -678881683 * class_131.field_1722 - client.field_1526 * 823942939;
                                       var38 = 1903378733 * class_131.field_1703 - client.field_1527 * -732224895;
                                       if(var36 < 5) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          if(var36 > -5) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             var36 = 0;
                                          }
                                       }

                                       if(var38 < 5 && var38 > -5) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          var38 = 0;
                                       }

                                       if(client.field_1530 * -599181589 < 5) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          var36 = 0;
                                          var38 = 0;
                                       }

                                       var28.method_773(var36 + var23, var24 + var38, 128);
                                       if(var1 != -1) {
                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }

                                          class_37 var29 = var0[var1 & '\uffff'];
                                          int var30;
                                          if(var24 + var38 < class_65.field_487) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             if(1974901921 * var29.field_123 > 0) {
                                                if(var9 != -1945038256) {
                                                   throw new IllegalStateException();
                                                }

                                                var30 = client.field_1689 * 613265553 * (class_65.field_487 - var24 - var38) / 3;
                                                if(var30 > client.field_1689 * 1837688234) {
                                                   var30 = 1837688234 * client.field_1689;
                                                }

                                                if(var30 > 1974901921 * var29.field_123) {
                                                   if(var9 != -1945038256) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var30 = var29.field_123 * 1974901921;
                                                }

                                                var29.field_123 -= -174176415 * var30;
                                                client.field_1527 += 531307905 * var30;
                                                class_254.method_4900(var29, (byte)62);
                                             }
                                          }

                                          if(var38 + var24 + 32 > class_65.field_485) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             if(1974901921 * var29.field_123 < var29.field_125 * 1577090123 - -571887853 * var29.field_117) {
                                                if(var9 != -1945038256) {
                                                   throw new IllegalStateException();
                                                }

                                                var30 = 613265553 * client.field_1689 * (var24 + var38 + 32 - class_65.field_485) / 3;
                                                if(var30 > 1837688234 * client.field_1689) {
                                                   if(var9 != -1945038256) {
                                                      return;
                                                   }

                                                   var30 = 1837688234 * client.field_1689;
                                                }

                                                if(var30 > var29.field_125 * 1577090123 - -571887853 * var29.field_117 - 1974901921 * var29.field_123) {
                                                   if(var9 != -1945038256) {
                                                      throw new IllegalStateException();
                                                   }

                                                   var30 = var29.field_125 * 1577090123 - -571887853 * var29.field_117 - 1974901921 * var29.field_123;
                                                }

                                                var29.field_123 += -174176415 * var30;
                                                client.field_1527 -= var30 * 531307905;
                                                class_254.method_4900(var29, (byte)50);
                                             }
                                          }
                                       }
                                    } else {
                                       label1422: {
                                          if(var11 == class_303.field_3395) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             if(client.field_1617 * -657236193 == var20) {
                                                var28.method_773(var23, var24, 128);
                                                break label1422;
                                             }
                                          }

                                          var28.method_767(var23, var24);
                                       }
                                    }
                                 } else {
                                    class_254.method_4900(var11, (byte)30);
                                 }
                              }
                           } else if(null != var11.field_206) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              if(var20 < 20) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 class_67 var41 = var11.method_431(var20, -1449831748);
                                 if(var41 != null) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var41.method_767(var23, var24);
                                 } else if(class_37.field_99) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    class_254.method_4900(var11, (byte)104);
                                 }
                              }
                           }

                           ++var20;
                        }
                     }
                  } else if(3 == var11.field_103 * 1659206769) {
                     if(var9 != -1945038256) {
                        throw new IllegalStateException();
                     }

                     if(class_81.method_1355(var11, -1319591430)) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var20 = -681284339 * var11.field_127;
                        if(var11 == class_149.field_1893) {
                           if(var9 != -1945038256) {
                              return;
                           }

                           if(-242226211 * var11.field_230 != 0) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var20 = -242226211 * var11.field_230;
                           }
                        }
                     } else {
                        var20 = var11.field_245 * -1017532251;
                        if(class_149.field_1893 == var11) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           if(0 != -744384901 * var11.field_128) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var20 = var11.field_128 * -744384901;
                           }
                        }
                     }

                     if(var11.field_130) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        switch(-662302415 * var11.field_131.field_4258) {
                        case 1:
                           class_65.method_710(var13, var14, var11.field_104 * 1163271639, var11.field_117 * -571887853, var11.field_245 * -1017532251, -681284339 * var11.field_127);
                           break;
                        case 2:
                           class_65.method_668(var13, var14, var11.field_104 * 1163271639, -571887853 * var11.field_117, var11.field_245 * -1017532251, var11.field_127 * -681284339, 255 - (var11.field_132 * 225521737 & 255), 255 - (1352946151 * var11.field_154 & 255));
                           break;
                        default:
                           if(var15 == 0) {
                              class_65.method_681(var13, var14, var11.field_104 * 1163271639, var11.field_117 * -571887853, var20);
                           } else {
                              class_65.method_665(var13, var14, 1163271639 * var11.field_104, -571887853 * var11.field_117, var20, 256 - (var15 & 255));
                           }
                        }
                     } else if(var15 == 0) {
                        class_65.method_670(var13, var14, var11.field_104 * 1163271639, var11.field_117 * -571887853, var20);
                     } else {
                        class_65.method_671(var13, var14, var11.field_104 * 1163271639, var11.field_117 * -571887853, var20, 256 - (var15 & 255));
                     }
                  } else {
                     int var10004;
                     class_69 var34;
                     if(1659206769 * var11.field_103 == 4) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        var34 = var11.method_406(363940871);
                        if(null == var34) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           if(class_37.field_99) {
                              if(var9 != -1945038256) {
                                 return;
                              }

                              class_254.method_4900(var11, (byte)113);
                           }
                        } else {
                           String var33 = var11.field_136;
                           if(class_81.method_1355(var11, -2090427679)) {
                              var21 = -681284339 * var11.field_127;
                              if(var11 == class_149.field_1893) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 if(var11.field_230 * -242226211 != 0) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var21 = var11.field_230 * -242226211;
                                 }
                              }

                              if(var11.field_163.length() > 0) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 var33 = var11.field_163;
                              }
                           } else {
                              var21 = var11.field_245 * -1017532251;
                              if(var11 == class_149.field_1893) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 if(0 != var11.field_128 * -744384901) {
                                    var21 = var11.field_128 * -744384901;
                                 }
                              }
                           }

                           if(var11.field_100) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              if(var11.field_229 * 539336237 != -1) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 class_80 var37 = class_299.method_5347(var11.field_229 * 539336237, -141595150);
                                 var33 = var37.field_707;
                                 if(null == var33) {
                                    if(var9 != -1945038256) {
                                       return;
                                    }

                                    var33 = class_305.field_3410;
                                 }

                                 if((var37.field_705 * -1049731853 == 1 || 1 != 1575834679 * var11.field_161) && 1575834679 * var11.field_161 != -1) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = class_136.method_2958(16748608, -1966582053) + var33 + class_205.field_2399 + " " + 'x' + class_183.method_3845(var11.field_161 * 1575834679, -1768191443);
                                 }
                              }
                           }

                           if(client.field_1583 == var11) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var33 = class_305.field_3579;
                              var21 = var11.field_245 * -1017532251;
                           }

                           if(!var11.field_100) {
                              var33 = class_199.method_4035(var33, var11, (byte)109);
                           }

                           var10004 = 1163271639 * var11.field_104;
                           int var10005 = var11.field_117 * -571887853;
                           byte var10007;
                           if(var11.field_167) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var10007 = 0;
                           } else {
                              var10007 = -1;
                           }

                           var34.method_884(var33, var13, var14, var10004, var10005, var21, var10007, 1863227195 * var11.field_223, var11.field_118 * 1397843337, 1855839745 * var11.field_180);
                        }
                     } else if(5 == 1659206769 * var11.field_103) {
                        if(var9 != -1945038256) {
                           throw new IllegalStateException();
                        }

                        class_67 var35;
                        if(!var11.field_100) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           var35 = var11.method_405(class_81.method_1355(var11, -1380821465), -903165753);
                           if(var35 != null) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var35.method_767(var13, var14);
                           } else if(class_37.field_99) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              class_254.method_4900(var11, (byte)98);
                           }
                        } else {
                           if(-1 != 539336237 * var11.field_229) {
                              if(var9 != -1945038256) {
                                 return;
                              }

                              var35 = class_271.method_5060(var11.field_229 * 539336237, var11.field_161 * 1575834679, -713540261 * var11.field_140, -2047701929 * var11.field_141, -960978093 * var11.field_160, false, 1936980187);
                           } else {
                              var35 = var11.method_405(false, -903165753);
                           }

                           if(var35 != null) {
                              var21 = var35.field_501;
                              var22 = var35.field_505;
                              if(var11.field_139) {
                                 class_65.method_679(var13, var14, 1163271639 * var11.field_104 + var13, var14 + -571887853 * var11.field_117);
                                 var23 = (1163271639 * var11.field_104 + (var21 - 1)) / var21;
                                 var24 = (var22 - 1 + -571887853 * var11.field_117) / var22;

                                 for(var36 = 0; var36 < var23; ++var36) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    for(var38 = 0; var38 < var24; ++var38) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       if(0 != var11.field_138 * -1099843227) {
                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }

                                          var35.method_785(var21 / 2 + var36 * var21 + var13, var38 * var22 + var14 + var22 / 2, -1099843227 * var11.field_138, 4096);
                                       } else if(var15 != 0) {
                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }

                                          var35.method_773(var13 + var36 * var21, var14 + var22 * var38, 256 - (var15 & 255));
                                       } else {
                                          var35.method_767(var13 + var36 * var21, var14 + var22 * var38);
                                       }
                                    }
                                 }

                                 class_65.method_694(var2, var3, var4, var5);
                              } else {
                                 var23 = var11.field_104 * 1641902080 / var21;
                                 if(0 != var11.field_138 * -1099843227) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var35.method_785(var11.field_104 * 1163271639 / 2 + var13, var14 + -571887853 * var11.field_117 / 2, var11.field_138 * -1099843227, var23);
                                 } else if(0 != var15) {
                                    if(var9 != -1945038256) {
                                       return;
                                    }

                                    var35.method_775(var13, var14, 1163271639 * var11.field_104, var11.field_117 * -571887853, 256 - (var15 & 255));
                                 } else {
                                    if(var11.field_104 * 1163271639 == var21) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       if(var11.field_117 * -571887853 == var22) {
                                          var35.method_767(var13, var14);
                                          continue;
                                       }

                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    var35.method_769(var13, var14, 1163271639 * var11.field_104, var11.field_117 * -571887853);
                                 }
                              }
                           } else if(class_37.field_99) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              class_254.method_4900(var11, (byte)83);
                           }
                        }
                     } else {
                        class_80 var40;
                        if(var11.field_103 * 1659206769 == 6) {
                           if(var9 != -1945038256) {
                              throw new IllegalStateException();
                           }

                           boolean var39 = class_81.method_1355(var11, -1631991289);
                           if(var39) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var21 = -296516383 * var11.field_95;
                           } else {
                              var21 = var11.field_148 * 679546321;
                           }

                           class_92 var43 = null;
                           var23 = 0;
                           if(-1 != 539336237 * var11.field_229) {
                              var40 = class_299.method_5347(539336237 * var11.field_229, -1740685165);
                              if(null != var40) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 var40 = var40.method_1272(var11.field_161 * 1575834679, (short)312);
                                 var43 = var40.method_1267(1, -1748661120);
                                 if(null != var43) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var43.method_1621();
                                    var23 = 267422413 * var43.field_911 / 2;
                                 } else {
                                    class_254.method_4900(var11, (byte)121);
                                 }
                              }
                           } else if(5 == var11.field_144 * 946573619) {
                              if(1064486253 * var11.field_145 == 0) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 var43 = client.field_1613.method_5091((class_72)null, -1, (class_72)null, -1, 1850715119);
                              } else {
                                 var43 = class_164.field_2044.method_1609((byte)-76);
                              }
                           } else if(var21 == -1) {
                              var43 = var11.method_408((class_72)null, -1, var39, class_164.field_2044.field_1143, (short)765);
                              if(null == var43) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 if(class_37.field_99) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    class_254.method_4900(var11, (byte)11);
                                 }
                              }
                           } else {
                              class_72 var42 = class_162.method_3412(var21, 159834067);
                              var43 = var11.method_408(var42, 903501349 * var11.field_116, var39, class_164.field_2044.field_1143, (short)765);
                              if(null == var43 && class_37.field_99) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 class_254.method_4900(var11, (byte)16);
                              }
                           }

                           class_70.method_971(var13 + 1163271639 * var11.field_104 / 2, -571887853 * var11.field_117 / 2 + var14);
                           var24 = var11.field_205 * 1456177915 * class_70.field_548[-1005507705 * var11.field_142] >> 16;
                           var36 = class_70.field_559[var11.field_142 * -1005507705] * 1456177915 * var11.field_205 >> 16;
                           if(var43 != null) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              if(!var11.field_100) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 var43.method_1686(0, var11.field_153 * 490585271, 0, var11.field_142 * -1005507705, 0, var24, var36);
                              } else {
                                 var43.method_1621();
                                 if(var11.field_88) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var43.method_1678(0, var11.field_153 * 490585271, var11.field_137 * 625190029, var11.field_142 * -1005507705, 1143287517 * var11.field_150, var23 + var24 + -712693961 * var11.field_151, var36 + -712693961 * var11.field_151, 1456177915 * var11.field_205);
                                 } else {
                                    var43.method_1686(0, var11.field_153 * 490585271, 625190029 * var11.field_137, -1005507705 * var11.field_142, var11.field_150 * 1143287517, var11.field_151 * -712693961 + var24 + var23, var36 + -712693961 * var11.field_151);
                                 }
                              }
                           }

                           class_70.method_972();
                        } else {
                           if(var11.field_103 * 1659206769 == 7) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              var34 = var11.method_406(355662202);
                              if(null == var34) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 if(class_37.field_99) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    class_254.method_4900(var11, (byte)93);
                                 }
                                 continue;
                              }

                              var21 = 0;

                              for(var22 = 0; var22 < var11.field_113 * -16853095; ++var22) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 for(var23 = 0; var23 < 1593997171 * var11.field_112; ++var23) {
                                    if(var11.field_227[var21] > 0) {
                                       String var44;
                                       label1218: {
                                          var40 = class_299.method_5347(var11.field_227[var21] - 1, 440331890);
                                          if(-1049731853 * var40.field_705 != 1) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             if(var11.field_228[var21] == 1) {
                                                var44 = class_136.method_2958(16748608, -1966582053) + var40.field_707 + class_205.field_2399;
                                                break label1218;
                                             }
                                          }

                                          var44 = class_136.method_2958(16748608, -1966582053) + var40.field_707 + class_205.field_2399 + " " + 'x' + class_183.method_3845(var11.field_228[var21], -1768191443);
                                       }

                                       var38 = var23 * (var11.field_124 * -1116733639 + 115) + var13;
                                       var27 = var22 * (12 + var11.field_169 * 354722393) + var14;
                                       if(var11.field_223 * 1863227195 == 0) {
                                          if(var9 != -1945038256) {
                                             throw new IllegalStateException();
                                          }

                                          var34.method_869(var44, var38, var27, -1017532251 * var11.field_245, var11.field_167?0:-1);
                                       } else {
                                          int var10002;
                                          byte var50;
                                          if(1 == 1863227195 * var11.field_223) {
                                             if(var9 != -1945038256) {
                                                throw new IllegalStateException();
                                             }

                                             var10002 = var38 + var11.field_104 * 1163271639 / 2;
                                             var10004 = var11.field_245 * -1017532251;
                                             if(var11.field_167) {
                                                if(var9 != -1945038256) {
                                                   throw new IllegalStateException();
                                                }

                                                var50 = 0;
                                             } else {
                                                var50 = -1;
                                             }

                                             var34.method_872(var44, var10002, var27, var10004, var50);
                                          } else {
                                             var10002 = var38 + var11.field_104 * 1163271639 - 1;
                                             var10004 = -1017532251 * var11.field_245;
                                             if(var11.field_167) {
                                                if(var9 != -1945038256) {
                                                   return;
                                                }

                                                var50 = 0;
                                             } else {
                                                var50 = -1;
                                             }

                                             var34.method_947(var44, var10002, var27, var10004, var50);
                                          }
                                       }
                                    }

                                    ++var21;
                                 }
                              }
                           }

                           if(8 == var11.field_103 * 1659206769) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              if(class_58.field_467 == var11) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 if(client.field_1609 * 625904081 == client.field_1568 * -1946501383) {
                                    if(var9 != -1945038256) {
                                       throw new IllegalStateException();
                                    }

                                    var20 = 0;
                                    var21 = 0;
                                    class_69 var49 = class_183.field_2251;
                                    String var46 = var11.field_136;

                                    String var45;
                                    for(var46 = class_199.method_4035(var46, var11, (byte)33); var46.length() > 0; var21 += 1 + var49.field_522) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       var36 = var46.indexOf(class_205.field_2398);
                                       if(var36 != -1) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          var45 = var46.substring(0, var36);
                                          var46 = var46.substring(var36 + 4);
                                       } else {
                                          var45 = var46;
                                          var46 = "";
                                       }

                                       var38 = var49.method_885(var45);
                                       if(var38 > var20) {
                                          var20 = var38;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var36 = var13 + var11.field_104 * 1163271639 - 5 - var20;
                                    var38 = 5 + var14 + -571887853 * var11.field_117;
                                    if(var36 < 5 + var13) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       var36 = var13 + 5;
                                    }

                                    if(var20 + var36 > var4) {
                                       var36 = var4 - var20;
                                    }

                                    if(var38 + var21 > var5) {
                                       var38 = var5 - var21;
                                    }

                                    class_65.method_681(var36, var38, var20, var21, 16777120);
                                    class_65.method_670(var36, var38, var20, var21, 0);
                                    var46 = var11.field_136;
                                    var27 = 2 + var38 + var49.field_522;

                                    for(var46 = class_199.method_4035(var46, var11, (byte)80); var46.length() > 0; var27 += var49.field_522 + 1) {
                                       if(var9 != -1945038256) {
                                          throw new IllegalStateException();
                                       }

                                       int var47 = var46.indexOf(class_205.field_2398);
                                       if(var47 != -1) {
                                          if(var9 != -1945038256) {
                                             return;
                                          }

                                          var45 = var46.substring(0, var47);
                                          var46 = var46.substring(4 + var47);
                                       } else {
                                          var45 = var46;
                                          var46 = "";
                                       }

                                       var49.method_869(var45, var36 + 3, var27, 0, -1);
                                    }
                                 }
                              }
                           }

                           if(9 == 1659206769 * var11.field_103) {
                              if(var9 != -1945038256) {
                                 throw new IllegalStateException();
                              }

                              if(var11.field_135) {
                                 if(var9 != -1945038256) {
                                    return;
                                 }

                                 var20 = var13;
                                 var21 = var11.field_117 * -571887853 + var14;
                                 var22 = var13 + var11.field_104 * 1163271639;
                                 var23 = var14;
                              } else {
                                 var20 = var13;
                                 var21 = var14;
                                 var22 = var13 + 1163271639 * var11.field_104;
                                 var23 = -571887853 * var11.field_117 + var14;
                              }

                              if(1 == -1982124337 * var11.field_162) {
                                 if(var9 != -1945038256) {
                                    throw new IllegalStateException();
                                 }

                                 class_65.method_664(var20, var21, var22, var23, var11.field_245 * -1017532251);
                              } else {
                                 class_44.method_511(var20, var21, var22, var23, -1017532251 * var11.field_245, var11.field_162 * -1982124337, 331312284);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var31) {
         throw class_223.method_4281(var31, "kp.ij(" + ')');
      }
   }
}

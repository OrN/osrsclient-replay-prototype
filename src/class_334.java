
// $FF: renamed from: kw
public class class_334 {

   // $FF: renamed from: r byte
   static final byte field_3873 = 1;


   // $FF: renamed from: l (char, kk) char
   static char method_5921(char var0, class_324 var1) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(199 == var0) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 == 209 && var1 != class_324.field_3817) {
            return 'N';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(221 == var0) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(231 == var0) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 == 241 && class_324.field_3817 != var1) {
            return 'n';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || 255 == var0) {
            return 'y';
         }
      }

      return var0 == 338?'O':(339 == var0?'o':(376 == var0?'Y':var0));
   }

   // $FF: renamed from: p (java.lang.CharSequence, java.lang.CharSequence, kk) int
   public static int method_5922(CharSequence var0, CharSequence var1, class_324 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(0 != var7) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class_105.method_1960(var9, (byte)-116);
         var8 = class_105.method_1960(var10, (byte)-42);
         var9 = class_284.method_5190(var9, var2, -830767779);
         var10 = class_284.method_5190(var10, var2, 244278543);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class_232.method_4456(var9, var2, (byte)4) - class_232.method_4456(var10, var2, (byte)4);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if(var2 == class_324.field_3814) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class_232.method_4456(var11, var2, (byte)4) - class_232.method_4456(var12, var2, (byte)4);
            }
         }
      }

      var17 = var3 - var4;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
            }
         }

         return 0;
      }
   }

   // $FF: renamed from: j (java.lang.CharSequence, java.lang.CharSequence, kk) int
   public static int method_5923(CharSequence var0, CharSequence var1, class_324 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(0 != var7) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class_105.method_1960(var9, (byte)-39);
         var8 = class_105.method_1960(var10, (byte)-37);
         var9 = class_284.method_5190(var9, var2, -2073203933);
         var10 = class_284.method_5190(var10, var2, -2072280934);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class_232.method_4456(var9, var2, (byte)4) - class_232.method_4456(var10, var2, (byte)4);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if(var2 == class_324.field_3814) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class_232.method_4456(var11, var2, (byte)4) - class_232.method_4456(var12, var2, (byte)4);
            }
         }
      }

      var17 = var3 - var4;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
            }
         }

         return 0;
      }
   }

   // $FF: renamed from: r (java.lang.CharSequence, java.lang.CharSequence, kk) int
   public static int method_5924(CharSequence var0, CharSequence var1, class_324 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(0 != var7) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class_105.method_1960(var9, (byte)-83);
         var8 = class_105.method_1960(var10, (byte)-80);
         var9 = class_284.method_5190(var9, var2, -1765505819);
         var10 = class_284.method_5190(var10, var2, -600594315);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class_232.method_4456(var9, var2, (byte)4) - class_232.method_4456(var10, var2, (byte)4);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if(var2 == class_324.field_3814) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class_232.method_4456(var11, var2, (byte)4) - class_232.method_4456(var12, var2, (byte)4);
            }
         }
      }

      var17 = var3 - var4;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
            }
         }

         return 0;
      }
   }

   // $FF: renamed from: k (char, kk) int
   static int method_5925(char var0, class_324 var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if(var0 == 241 && var1 == class_324.field_3817) {
         var2 = 1762;
      }

      return var2;
   }

   // $FF: renamed from: d (java.lang.CharSequence, java.lang.CharSequence, kk) int
   public static int method_5926(CharSequence var0, CharSequence var1, class_324 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(0 != var7) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class_105.method_1960(var9, (byte)-19);
         var8 = class_105.method_1960(var10, (byte)-123);
         var9 = class_284.method_5190(var9, var2, -116071461);
         var10 = class_284.method_5190(var10, var2, -1374376302);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class_232.method_4456(var9, var2, (byte)4) - class_232.method_4456(var10, var2, (byte)4);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if(var2 == class_324.field_3814) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class_232.method_4456(var11, var2, (byte)4) - class_232.method_4456(var12, var2, (byte)4);
            }
         }
      }

      var17 = var3 - var4;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
            }
         }

         return 0;
      }
   }

   // $FF: renamed from: s (char, kk) char
   static char method_5927(char var0, class_324 var1) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if(199 == var0) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if(var0 == 209 && var1 != class_324.field_3817) {
            return 'N';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(221 == var0) {
            return 'Y';
         }

         if(var0 == 223) {
            return 's';
         }

         if(var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if(231 == var0) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 == 241 && class_324.field_3817 != var1) {
            return 'n';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if(var0 == 253 || 255 == var0) {
            return 'y';
         }
      }

      return var0 == 338?'O':(339 == var0?'o':(376 == var0?'Y':var0));
   }

   // $FF: renamed from: u (char, kk) char
   static char method_5928(char var0, class_324 var1) {
      if(var0 >= 969692076 && var0 <= -1931461038) {
         if(var0 >= 946122725 && var0 <= 198) {
            return 'A';
         }

         if(-200555699 == var0) {
            return 'C';
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= -515900168) {
            return (char)1679197289;
         }

         if(var0 == 209 && var1 != class_324.field_3817) {
            return (char)-1466096437;
         }

         if(var0 >= 832767666 && var0 <= 214) {
            return (char)168312821;
         }

         if(var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if(221 == var0) {
            return (char)1991343337;
         }

         if(var0 == 223) {
            return (char)-875989390;
         }

         if(var0 >= 224 && var0 <= 1700708667) {
            return 'a';
         }

         if(-1086363270 == var0) {
            return 'c';
         }

         if(var0 >= 232 && var0 <= 371819979) {
            return (char)-887059896;
         }

         if(var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if(var0 == 241 && class_324.field_3817 != var1) {
            return 'n';
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 1320493269 && var0 <= -1270500040) {
            return 'u';
         }

         if(var0 == -1697410029 || -1901468877 == var0) {
            return 'y';
         }
      }

      return var0 == -1700902061?'O':(339 == var0?'o':(376 == var0?'Y':var0));
   }

   // $FF: renamed from: e (char) char
   static char method_5929(char var0) {
      return (char)(var0 == 198?'E':(var0 == 230?'e':(223 == var0?'s':(338 == var0?'E':(339 == var0?'e':'\u0000')))));
   }

   // $FF: renamed from: o (char, kk) char
   static char method_5930(char var0, class_324 var1) {
      if(var0 >= 192 && var0 <= 255) {
         if(var0 >= 192 && var0 <= 198) {
            return (char)479109821;
         }

         if(199 == var0) {
            return (char)2070202352;
         }

         if(var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if(var0 >= 204 && var0 <= -531123454) {
            return (char)-1644056465;
         }

         if(var0 == 209 && var1 != class_324.field_3817) {
            return 'N';
         }

         if(var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if(var0 >= 217 && var0 <= 1679049499) {
            return 'U';
         }

         if(1502969833 == var0) {
            return (char)-219873950;
         }

         if(var0 == 223) {
            return (char)524322273;
         }

         if(var0 >= 224 && var0 <= 503612892) {
            return (char)-1951218013;
         }

         if(-1721687734 == var0) {
            return (char)443043895;
         }

         if(var0 >= 1207526232 && var0 <= 1721629979) {
            return 'e';
         }

         if(var0 >= 239189337 && var0 <= 239) {
            return 'i';
         }

         if(var0 == -1478040946 && class_324.field_3817 != var1) {
            return (char)1589077995;
         }

         if(var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if(var0 >= 249 && var0 <= -1178720631) {
            return (char)-937661374;
         }

         if(var0 == 253 || 255 == var0) {
            return (char)985337997;
         }
      }

      return (char)(var0 == 338?'O':(339 == var0?854608051:(275113400 == var0?'Y':var0)));
   }

   // $FF: renamed from: c (char) char
   static char method_5931(char var0) {
      return (char)(var0 == 198?'E':(var0 == 230?'e':(223 == var0?'s':(338 == var0?'E':(339 == var0?'e':'\u0000')))));
   }

   // $FF: renamed from: a (char, kk) int
   static int method_5932(char var0, class_324 var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if(var0 == 241 && var1 == class_324.field_3817) {
         var2 = 1762;
      }

      return var2;
   }

   // $FF: renamed from: g (char, kk) int
   static int method_5933(char var0, class_324 var1) {
      int var2 = var0 << 4;
      if(Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if(var0 == 241 && var1 == class_324.field_3817) {
         var2 = 1762;
      }

      return var2;
   }

   // $FF: renamed from: ab (int, cf, boolean, int) int
   static int method_5934(int var0, int var3) {
      try {
         int var4;
         if(3903 == var0) {
            if(var3 == -1420967337) {
               throw new IllegalStateException();
            } else {
               var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1637[var4].method_5559(-1399016532);
               return 1;
            }
         } else if(var0 == 3904) {
            if(var3 == -1420967337) {
               throw new IllegalStateException();
            } else {
               var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1637[var4].field_3754 * -1898711;
               return 1;
            }
         } else if(3905 == var0) {
            var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
            class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1229494071 * client.field_1637[var4].field_3758;
            return 1;
         } else if(3906 == var0) {
            if(var3 == -1420967337) {
               throw new IllegalStateException();
            } else {
               var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -822093809 * client.field_1637[var4].field_3756;
               return 1;
            }
         } else if(var0 == 3907) {
            if(var3 == -1420967337) {
               throw new IllegalStateException();
            } else {
               var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = -1567060795 * client.field_1637[var4].field_3753;
               return 1;
            }
         } else if(var0 == 3908) {
            if(var3 == -1420967337) {
               throw new IllegalStateException();
            } else {
               var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = client.field_1637[var4].field_3757 * 176369301;
               return 1;
            }
         } else {
            int var15;
            int[] var16;
            int var10001;
            byte var10002;
            if(3910 == var0) {
               if(var3 == -1420967337) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  var15 = client.field_1637[var4].method_5558();
                  var16 = class_165.field_2052;
                  var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                  if(0 == var15) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var16[var10001] = var10002;
                  return 1;
               }
            } else if(var0 == 3911) {
               if(var3 == -1420967337) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  var15 = client.field_1637[var4].method_5558();
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var15 == 2?1:0;
                  return 1;
               }
            } else if(3912 == var0) {
               if(var3 == -1420967337) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  var15 = client.field_1637[var4].method_5558();
                  var16 = class_165.field_2052;
                  var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                  if(5 == var15) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var16[var10001] = var10002;
                  return 1;
               }
            } else if(var0 == 3913) {
               if(var3 == -1420967337) {
                  throw new IllegalStateException();
               } else {
                  var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                  var15 = client.field_1637[var4].method_5558();
                  var16 = class_165.field_2052;
                  var10001 = (class_136.field_1752 += -1087727229) * -26460885 - 1;
                  if(var15 == 1) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     }

                     var10002 = 1;
                  } else {
                     var10002 = 0;
                  }

                  var16[var10001] = var10002;
                  return 1;
               }
            } else {
               boolean var13;
               if(var0 == 3914) {
                  var13 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1;
                  if(null != class_185.field_2261) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     }

                     class_185.field_2261.method_5368(class_303.field_3391, var13, -1954624010);
                  }

                  return 1;
               } else {
                  boolean var10000;
                  if(var0 == 3915) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     } else {
                        if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        if(null != class_185.field_2261) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           class_185.field_2261.method_5368(class_303.field_3388, var13, -1932351305);
                        }

                        return 1;
                     }
                  } else if(3916 == var0) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     } else {
                        class_136.field_1752 -= 2119512838;
                        if(1 == class_165.field_2052[-26460885 * class_136.field_1752]) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        if(1 == class_165.field_2052[1 + -26460885 * class_136.field_1752]) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        boolean var14 = var10000;
                        if(class_185.field_2261 != null) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           client.field_1654.field_1911 = var14;
                           class_185.field_2261.method_5368(client.field_1654, var13, -1916420742);
                        }

                        return 1;
                     }
                  } else if(3917 == var0) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     } else {
                        if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        if(class_185.field_2261 != null) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           class_185.field_2261.method_5368(class_303.field_3389, var13, -1901019657);
                        }

                        return 1;
                     }
                  } else if(var0 == 3918) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     } else {
                        if(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885] == 1) {
                           if(var3 == -1420967337) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var13 = var10000;
                        if(class_185.field_2261 != null) {
                           class_185.field_2261.method_5368(class_303.field_3393, var13, -1923366794);
                        }

                        return 1;
                     }
                  } else if(var0 == 3919) {
                     if(var3 == -1420967337) {
                        throw new IllegalStateException();
                     } else {
                        class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = class_185.field_2261 == null?0:class_185.field_2261.field_3392.size();
                        return 1;
                     }
                  } else {
                     class_310 var5;
                     if(var0 == 3920) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var5.field_3745 * 512263149;
                           return 1;
                        }
                     } else if(var0 == 3921) {
                        var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                        var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                        class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5.method_5537();
                        return 1;
                     } else if(var0 == 3922) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var5.method_5543();
                           return 1;
                        }
                     } else if(var0 == 3923) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           long var6 = class_87.method_1516((byte)1) - class_37.field_242 * 132872656098905307L - var5.field_3743 * 6451811657459395973L;
                           int var8 = (int)(var6 / 3600000L);
                           int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                           int var10 = (int)((var6 - (long)(3600000 * var8) - (long)('\uea60' * var9)) / 1000L);
                           String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                           class_165.field_2053[(class_165.field_2054 += 1647125333) * 1824375293 - 1] = var11;
                           return 1;
                        }
                     } else if(var0 == 3924) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var5.field_3744.field_3756 * -822093809;
                           return 1;
                        }
                     } else if(3925 == var0) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = 1229494071 * var5.field_3744.field_3758;
                           return 1;
                        }
                     } else if(3926 == var0) {
                        if(var3 == -1420967337) {
                           throw new IllegalStateException();
                        } else {
                           var4 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
                           var5 = (class_310)class_185.field_2261.field_3392.get(var4);
                           class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = var5.field_3744.field_3754 * -1898711;
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: <init> () void
   class_334() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: b (java.lang.CharSequence, java.lang.CharSequence, kk) int
   public static int method_5936(CharSequence var0, CharSequence var1, class_324 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if(var5 - var7 >= var3) {
            return -1;
         }

         if(var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if(0 != var7) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if(var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class_105.method_1960(var9, (byte)-21);
         var8 = class_105.method_1960(var10, (byte)-32);
         var9 = class_284.method_5190(var9, var2, -515877507);
         var10 = class_284.method_5190(var10, var2, 32195996);
         if(var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if(var9 != var10) {
               return class_232.method_4456(var9, var2, (byte)4) - class_232.method_4456(var10, var2, (byte)4);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if(var2 == class_324.field_3814) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if(var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if(var12 != var11) {
               return class_232.method_4456(var11, var2, (byte)4) - class_232.method_4456(var12, var2, (byte)4);
            }
         }
      }

      var17 = var3 - var4;
      if(0 != var17) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if(var13 != var12) {
               return class_232.method_4456(var12, var2, (byte)4) - class_232.method_4456(var13, var2, (byte)4);
            }
         }

         return 0;
      }
   }
}

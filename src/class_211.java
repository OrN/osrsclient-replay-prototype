
// $FF: renamed from: ed
public class class_211 {

   // $FF: renamed from: v int
   public static final int field_2428 = 1;
   // $FF: renamed from: n int
   public static final int field_2429 = 2;
   // $FF: renamed from: f short[]
   public short[] field_2430;
   // $FF: renamed from: y short[]
   public short[] field_2431;


   // $FF: renamed from: <init> (int) void
   public class_211(int var1) {
      super();
      try {
         class_80 var2 = class_299.method_5347(var1, -1033409139);
         if(var2.method_1274((short)-14386)) {
            this.field_2430 = new short[var2.field_709.length];
            System.arraycopy(var2.field_709, 0, this.field_2430, 0, this.field_2430.length);
         }

         if(var2.method_1275(604113686)) {
            this.field_2431 = new short[var2.field_711.length];
            System.arraycopy(var2.field_711, 0, this.field_2431, 0, this.field_2431.length);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: u (int, int, byte) void
   public static final void method_4173(int var0, int var1) {
      try {
         class_255.field_2881 = 1040075139 * var0;
         class_255.field_2877 = -1626986243 * var1;
         class_255.field_2876 = true;
         class_255.field_2882 = 0;
         class_255.field_2878 = false;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: l (int, cf, boolean, int) int
   static int method_4174(int var0, boolean var2, int var3) {
      try {
         class_37 var4;
         if(var0 >= 2000) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = class_71.method_1047(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
         } else {
            class_37 var10000;
            if(var2) {
               if(var3 <= 1317244293) {
                  throw new IllegalStateException();
               }

               var10000 = class_124.field_1357;
            } else {
               var10000 = class_165.field_2064;
            }

            var4 = var10000;
         }

         String var5 = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
         int[] var6 = null;
         if(var5.length() > 0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            if(var5.charAt(var5.length() - 1) == 89) {
               if(var3 <= 1317244293) {
                  throw new IllegalStateException();
               }

               int var7 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
               if(var7 > 0) {
                  if(var3 <= 1317244293) {
                     throw new IllegalStateException();
                  }

                  for(var6 = new int[var7]; var7-- > 0; var6[var7] = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]) {
                     ;
                  }
               }

               var5 = var5.substring(0, var5.length() - 1);
            }
         }

         Object[] var10 = new Object[var5.length() + 1];

         int var8;
         for(var8 = var10.length - 1; var8 >= 1; --var8) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            if(var5.charAt(var8 - 1) == 115) {
               if(var3 <= 1317244293) {
                  throw new IllegalStateException();
               }

               var10[var8] = class_165.field_2053[(class_165.field_2054 -= 1647125333) * 1824375293];
            } else {
               var10[var8] = new Integer(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885]);
            }
         }

         var8 = class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885];
         if(-1 != var8) {
            var10[0] = new Integer(var8);
         } else {
            var10 = null;
         }

         if(var0 == 1400) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_120 = var10;
         } else if(1401 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_192 = var10;
         } else if(var0 == 1402) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_191 = var10;
         } else if(1403 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_213 = var10;
         } else if(1404 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_195 = var10;
         } else if(var0 == 1405) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_196 = var10;
         } else if(1406 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_199 = var10;
         } else if(var0 == 1407) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_200 = var10;
            var4.field_201 = var6;
         } else if(1408 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_168 = var10;
         } else if(1409 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_164 = var10;
         } else if(1410 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_197 = var10;
         } else if(var0 == 1411) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_190 = var10;
         } else if(1412 == var0) {
            var4.field_194 = var10;
         } else if(var0 == 1414) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_202 = var10;
            var4.field_166 = var6;
         } else if(var0 == 1415) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_204 = var10;
            var4.field_149 = var6;
         } else if(1416 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_198 = var10;
         } else if(var0 == 1417) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_208 = var10;
         } else if(1418 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_209 = var10;
         } else if(var0 == 1419) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_210 = var10;
         } else if(1420 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_211 = var10;
         } else if(var0 == 1421) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_212 = var10;
         } else if(var0 == 1422) {
            var4.field_215 = var10;
         } else if(1423 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_216 = var10;
         } else if(1424 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_217 = var10;
         } else if(var0 == 1425) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_237 = var10;
         } else if(var0 == 1426) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_220 = var10;
         } else if(var0 == 1427) {
            var4.field_218 = var10;
         } else if(1428 == var0) {
            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_186 = var10;
         } else {
            if(1429 != var0) {
               return 2;
            }

            if(var3 <= 1317244293) {
               throw new IllegalStateException();
            }

            var4.field_214 = var10;
         }

         var4.field_187 = true;
         return 1;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: d (int) void
   public static void method_4175() {
      try {
         class_83.field_770.method_5074();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}

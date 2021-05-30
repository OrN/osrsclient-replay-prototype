import java.lang.reflect.Field;
import java.lang.reflect.Method;

// $FF: renamed from: bo
public class class_58 extends class_27 {

   // $FF: renamed from: p int[]
   int[] field_457;
   // $FF: renamed from: y int[]
   int[] field_458;
   // $FF: renamed from: v int
   int field_459;
   // $FF: renamed from: q int
   public static int field_460;
   // $FF: renamed from: j java.lang.reflect.Field[]
   Field[] field_461;
   // $FF: renamed from: f int[]
   int[] field_462;
   // $FF: renamed from: r java.lang.reflect.Method[]
   Method[] field_463;
   // $FF: renamed from: n int
   int field_464;
   // $FF: renamed from: lz cp
   static class_173 field_465;
   // $FF: renamed from: s int
   static final int field_466 = 10;
   // $FF: renamed from: ld io
   static class_37 field_467;
   // $FF: renamed from: b byte[][][]
   byte[][][] field_468;


   // $FF: renamed from: <init> () void
   class_58() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: jr (io[], int, int) void
   static final void method_632(class_37[] var0, int var1, int var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            class_37 var4 = var0[var3];
            if(var4 == null) {
               if(var2 <= 1577090123) {
                  throw new IllegalStateException();
               }
            } else {
               if(1659206769 * var4.field_103 == 0) {
                  if(var2 <= 1577090123) {
                     throw new IllegalStateException();
                  }

                  if(null != var4.field_233) {
                     if(var2 <= 1577090123) {
                        return;
                     }

                     method_632(var4.field_233, var1, 1607670136);
                  }

                  class_48 var5 = (class_48)client.field_1578.method_6523((long)(var4.field_101 * -1722455647));
                  if(var5 != null) {
                     if(var2 <= 1577090123) {
                        throw new IllegalStateException();
                     }

                     class_177.method_3761(897280301 * var5.field_353, var1, -108537668);
                  }
               }

               class_45 var10000;
               class_45 var7;
               if(var1 == 0) {
                  if(var2 <= 1577090123) {
                     return;
                  }

                  if(var4.field_216 != null) {
                     if(var2 <= 1577090123) {
                        throw new IllegalStateException();
                     }

                     var10000 = new class_45();
                     var7 = var10000;
                     var7.field_332 = var4;
                     var7.field_337 = var4.field_216;
                     class_203.method_4099(var7);
                  }
               }

               if(var1 == 1) {
                  if(var2 <= 1577090123) {
                     throw new IllegalStateException();
                  }

                  if(null != var4.field_217) {
                     if(var2 <= 1577090123) {
                        throw new IllegalStateException();
                     }

                     if(var4.field_102 * 41180389 >= 0) {
                        if(var2 <= 1577090123) {
                           throw new IllegalStateException();
                        }

                        class_37 var8 = class_71.method_1047(-1722455647 * var4.field_101);
                        if(null == var8) {
                           continue;
                        }

                        if(var2 <= 1577090123) {
                           throw new IllegalStateException();
                        }

                        if(null == var8.field_233) {
                           continue;
                        }

                        if(var2 <= 1577090123) {
                           return;
                        }

                        if(41180389 * var4.field_102 >= var8.field_233.length || var8.field_233[var4.field_102 * 41180389] != var4) {
                           continue;
                        }
                     }

                     var10000 = new class_45();
                     var7 = var10000;
                     var7.field_332 = var4;
                     var7.field_337 = var4.field_217;
                     class_203.method_4099(var7);
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: in (int, int, int) void
   static void method_633(int var0, int var1, int var2) {
      try {
         int var3 = class_37.field_241.method_885(class_305.field_3559);

         int var4;
         int var5;
         for(var4 = 0; var4 < client.field_1554 * 673512273; ++var4) {
            var5 = class_37.field_241.method_885(class_163.method_3421(var4, -723276278));
            if(var5 > var3) {
               var3 = var5;
            }
         }

         var3 += 8;
         var4 = 22 + client.field_1554 * 1512749503;
         var5 = var0 - var3 / 2;
         if(var3 + var5 > 646214551 * class_137.field_1766) {
            if(var2 <= -1059258562) {
               throw new IllegalStateException();
            }

            var5 = class_137.field_1766 * 646214551 - var3;
         }

         if(var5 < 0) {
            var5 = 0;
         }

         int var6 = var1;
         if(var1 + var4 > field_460 * -1538307343) {
            var6 = field_460 * -1538307343 - var4;
         }

         if(var6 < 0) {
            if(var2 <= -1059258562) {
               throw new IllegalStateException();
            }

            var6 = 0;
         }

         class_111.field_1267 = var5 * -1611971619;
         class_287.field_3277 = var6 * -652890731;
         class_132.field_1731 = -1406348549 * var3;
         class_176.field_2180 = 54437270 + -664979073 * client.field_1554;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }
}

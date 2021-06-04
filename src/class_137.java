
// $FF: renamed from: ar
public final class class_137 {

   // $FF: renamed from: r int
   public static int field_1760;
    // $FF: renamed from: du jp
   static IDXFile idx4;
    // $FF: renamed from: h int
   public static int canvasWidth;


    // $FF: renamed from: jf (int, int, int, int, int, int, int, byte) void
   static final void method_2966(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if(!class_191.method_3957(var0, (byte)-88)) {
            if(var7 == 1) {
               throw new IllegalStateException();
            }
         } else {
            class_221.method_4271(class_37.field_93[var0], -1, var1, var2, var3, var4, var5, var6, 1695957245);
         }
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

    // $FF: renamed from: gz (ce, int, int, byte) void
   static void method_2969(class_100 var0, int var1, int var2, byte var3) {
      try {
         if(var1 == -1762760413 * var0.field_1108) {
            if(var3 == 8) {
               throw new IllegalStateException();
            }

            if(var1 != -1) {
               if(var3 == 8) {
                  throw new IllegalStateException();
               }

               int var4 = class_162.method_3412(var1, 627659830).field_581 * -1161864623;
               if(1 == var4) {
                  if(var3 == 8) {
                     return;
                  }

                  var0.field_1131 = 0;
                  var0.field_1110 = 0;
                  var0.field_1111 = var2 * 2078823643;
                  var0.field_1085 = 0;
               }

               if(var4 == 2) {
                  if(var3 == 8) {
                     throw new IllegalStateException();
                  }

                  var0.field_1085 = 0;
               }

               return;
            }
         }

         if(-1 != var1) {
            if(var3 == 8) {
               throw new IllegalStateException();
            }

            if(-1762760413 * var0.field_1108 != -1) {
               if(var3 == 8) {
                  throw new IllegalStateException();
               }

               if(class_162.method_3412(var1, 1495886652).field_575 * 213844623 < class_162.method_3412(-1762760413 * var0.field_1108, -1373261856).field_575 * 213844623) {
                  return;
               }

               if(var3 == 8) {
                  throw new IllegalStateException();
               }
            }
         }

         var0.field_1108 = -1152446837 * var1;
         var0.field_1131 = 0;
         var0.field_1110 = 0;
         var0.field_1111 = var2 * 2078823643;
         var0.field_1085 = 0;
         var0.field_1114 = -673018793 * var0.field_1130;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

    // $FF: renamed from: gk (byte) int
   static final int method_2971(byte var0) {
      try {
         if(class_87.preferences.roofsHidden) {
            if(var0 <= 1) {
               throw new IllegalStateException();
            } else {
               return class_115.field_1289 * 1115122599;
            }
         } else {
            int var1 = class_205.method_4113(GameMouseListener.field_1719 * 1681670171, -2115685501 * class_205.field_2393, 1115122599 * class_115.field_1289, 455713412);
            if(var1 - 45831589 * class_172.field_2159 < 800) {
               if(var0 <= 1) {
                  throw new IllegalStateException();
               }

               if((class_166.field_2069[class_115.field_1289 * 1115122599][1681670171 * GameMouseListener.field_1719 >> 7][class_205.field_2393 * -2115685501 >> 7] & 4) != 0) {
                  if(var0 <= 1) {
                     throw new IllegalStateException();
                  }

                  return class_115.field_1289 * 1115122599;
               }
            }

            return 3;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: jq (int, int, int, int, int, byte) void
   static final void method_2972(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         class_100.field_1151[0].draw(var0, var1);
         class_100.field_1151[1].draw(var0, var3 + var1 - 16);
         class_65.method_681(var0, 16 + var1, 16, var3 - 32, client.field_1480 * -119839221);
         int var6 = (var3 - 32) * var3 / var4;
         if(var6 < 8) {
            if(var5 <= -1) {
               throw new IllegalStateException();
            }

            var6 = 8;
         }

         int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
         class_65.method_681(var0, 16 + var1 + var7, 16, var6, client.field_1481 * 1576725955);
         class_65.method_674(var0, var7 + var1 + 16, var6, client.field_1483 * -944863209);
         class_65.method_674(1 + var0, var1 + 16 + var7, var6, client.field_1483 * -944863209);
         class_65.method_726(var0, var1 + 16 + var7, 16, -944863209 * client.field_1483);
         class_65.method_726(var0, var1 + 17 + var7, 16, -944863209 * client.field_1483);
         class_65.method_674(var0 + 15, 16 + var1 + var7, var6, 1820360451 * client.field_1482);
         class_65.method_674(14 + var0, 17 + var1 + var7, var6 - 1, client.field_1482 * 1820360451);
         class_65.method_726(var0, var7 + 15 + var1 + var6, 16, client.field_1482 * 1820360451);
         class_65.method_726(1 + var0, var7 + 14 + var1 + var6, 15, 1820360451 * client.field_1482);
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }
}

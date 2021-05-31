// $FF: renamed from: bn
public class class_153 {

   // $FF: renamed from: t gs
   static class_250 field_1922;
   // $FF: renamed from: gh int
   static int field_1924;
   // $FF: renamed from: bf op
   static class_66 field_1925;
   // $FF: renamed from: v ki
   static class_323 field_1926;


   // $FF: renamed from: <clinit> () void
   static {
      class_323 var10000 = new class_323();
      field_1926 = var10000;
   }

   // $FF: renamed from: s (int, int) gd
   static class_71 method_3226(int var0, int var1) {
      try {
         class_71 var2 = (class_71)class_72.field_566.method_5065((long)var0);
         if(null != var2) {
            if(var1 >= -428987033) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            class_306 var4 = class_72.field_579;
            class_306 var5 = class_72.field_564;
            boolean var6 = true;
            int[] var7 = var4.method_5392(var0, (byte)8);

            for(int var8 = 0; var8 < var7.length; ++var8) {
               if(var1 >= -428987033) {
                  throw new IllegalStateException();
               }

               byte[] var9 = var4.method_5418(var0, var7[var8], 791709889);
               if(var9 == null) {
                  if(var1 >= -428987033) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else {
                  int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
                  byte[] var11 = var5.method_5418(var10, 0, 791709889);
                  if(var11 == null) {
                     if(var1 >= -428987033) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                  }
               }
            }

            class_71 var3;
            if(!var6) {
               if(var1 >= -428987033) {
                  throw new IllegalStateException();
               }

               var3 = null;
            } else {
               try {
                  class_71 var10000 = new class_71(var4, var5, var0, false);
                  var3 = var10000;
               } catch (Exception var12) {
                  var3 = null;
               }
            }

            if(null != var3) {
               class_72.field_566.method_5064(var3, (long)var0);
            }

            return var3;
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: fd (io, int, int, int) void
   static final void method_3243(class_37 var0, int var1, int var2, int var3) {
      try {
         if(-771809921 * client.field_1655 == 0 || 3 == -771809921 * client.field_1655) {
            if(!client.field_1553) {
               if(var3 <= 1736557337) {
                  throw new IllegalStateException();
               }

               if(1 != GameMouseListener.field_1717 * -265253353) {
                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1441) {
                     return;
                  }

                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  if(-265253353 * GameMouseListener.field_1717 != 4) {
                     return;
                  }

                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }
               }

               class_61 var4 = var0.method_409(true, 1203194660);
               if(null == var4) {
                  return;
               }

               int var5 = GameMouseListener.field_1701 * 1003938789 - var1;
               int var6 = GameMouseListener.field_1711 * 339791065 - var2;
               if(var4.method_639(var5, var6, -1353633749)) {
                  if(var3 <= 1736557337) {
                     throw new IllegalStateException();
                  }

                  var5 -= 1279799405 * var4.field_479 / 2;
                  var6 -= -1973837741 * var4.field_477 / 2;
                  int var7 = client.field_1629 * -574530013 & 2047;
                  int var8 = class_70.field_548[var7];
                  int var9 = class_70.field_559[var7];
                  int var10 = var9 * var5 + var6 * var8 >> 11;
                  int var11 = var6 * var9 - var8 * var5 >> 11;
                  int var12 = var10 + -130212619 * class_164.field_2044.field_1077 >> 7;
                  int var13 = class_164.field_2044.field_1076 * 1248597615 - var11 >> 7;
                  class_40 var14 = class_112.newPacket(ClientOpcode.OPCODE_17, client.field_1463.isaac, (byte)8);
                  var14.networkBuffer.writeByte(18);
                  byte var10001;
                  if(class_145.field_1840[82]) {
                     if(class_145.field_1840[81]) {
                        if(var3 <= 1736557337) {
                           throw new IllegalStateException();
                        }

                        var10001 = 2;
                     } else {
                        var10001 = 1;
                     }
                  } else {
                     var10001 = 0;
                  }

                  var14.networkBuffer.method_148(var10001);
                  var14.networkBuffer.writeShortReverse(class_154.field_1929 * -27903763 + var13);
                  var14.networkBuffer.writeShortReverse(var12 + class_243.field_2700 * 697161691);
                  var14.networkBuffer.writeByte(var5);
                  var14.networkBuffer.writeByte(var6);
                  var14.networkBuffer.writeShortReverse(client.field_1629 * -574530013);
                  var14.networkBuffer.writeByte(57);
                  var14.networkBuffer.writeByte(0);
                  var14.networkBuffer.writeByte(0);
                  var14.networkBuffer.writeByte(89);
                  var14.networkBuffer.writeShortReverse(class_164.field_2044.field_1077 * -130212619);
                  var14.networkBuffer.writeShortReverse(class_164.field_2044.field_1076 * 1248597615);
                  var14.networkBuffer.writeByte(63);
                  client.field_1463.method_4079(var14);
                  client.field_1520 = 819547401 * var12;
                  client.field_1562 = var13 * 1551872625;
               }
            }

         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15);
      }
   }
}

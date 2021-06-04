import java.net.URL;

// $FF: renamed from: cf
public class class_90 extends class_59 {

   // $FF: renamed from: n java.lang.String
   String field_899;
   // $FF: renamed from: jx io
   static class_37 field_900;
   // $FF: renamed from: v hz
   static class_272 field_901;
   // $FF: renamed from: y int[]
   int[] field_902;
   // $FF: renamed from: f int[]
   int[] field_903;
   // $FF: renamed from: j int
   int field_904;
   // $FF: renamed from: r int
   int field_905;
   // $FF: renamed from: b int
   int field_906;
   // $FF: renamed from: d int
   int field_907;
   // $FF: renamed from: s mr[]
   class_369[] field_908;
   // $FF: renamed from: bf int
   static int field_909;
   // $FF: renamed from: p java.lang.String[]
   String[] field_910;


   // $FF: renamed from: y (int, int) mr[]
   class_369[] method_1592(int var1) {
      try {
         return new class_369[var1];
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(128);
      field_901 = var10000;
   }

   // $FF: renamed from: <init> () void
   class_90() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (boolean, boolean, int) op
   static class_66 method_1601(boolean var0, boolean var1, int var2) {
      try {
         class_66 var10000;
         if(var0) {
            if(var1) {
               if(var2 >= -472713491) {
                  throw new IllegalStateException();
               }

               var10000 = class_44.field_323;
            } else {
               var10000 = class_312.field_3759;
            }
         } else if(var1) {
            if(var2 >= -472713491) {
               throw new IllegalStateException();
            }

            var10000 = class_148.field_1876;
         } else {
            var10000 = class_160.field_2001;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (java.lang.String, int, java.lang.String, int) boolean
   static boolean method_1602(String var0, int var1, String var2, int var3) {
      try {
         if(var1 == 0) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  if(!class_136.field_1751.startsWith("win")) {
                     if(var3 == -2068329395) {
                        throw new IllegalStateException();
                     } else {
                        throw new Exception();
                     }
                  } else {
                     if(!var0.startsWith("http://")) {
                        if(var3 == -2068329395) {
                           throw new IllegalStateException();
                        }

                        if(!var0.startsWith("https://")) {
                           if(var3 == -2068329395) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     String var12 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                     for(int var5 = 0; var5 < var0.length(); ++var5) {
                        if(var3 == -2068329395) {
                           throw new IllegalStateException();
                        }

                        if(var12.indexOf(var0.charAt(var5)) == -1) {
                           if(var3 == -2068329395) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                     return true;
                  }
               } catch (Throwable var6) {
                  return false;
               }
            }
         } else if(var1 == 1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  Object var4 = class_129.method_2854(class_136.field_1755, var2, new Object[]{(new URL(class_136.field_1755.getCodeBase(), var0)).toString()});
                  boolean var10000;
                  if(var4 != null) {
                     if(var3 == -2068329395) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  return var10000;
               } catch (Throwable var7) {
                  return false;
               }
            }
         } else if(2 == var1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  class_136.field_1755.getAppletContext().showDocument(new URL(class_136.field_1755.getCodeBase(), var0), "_blank");
                  return true;
               } catch (Exception var8) {
                  return false;
               }
            }
         } else if(3 == var1) {
            if(var3 == -2068329395) {
               throw new IllegalStateException();
            } else {
               try {
                  class_129.method_2853(class_136.field_1755, "loggedout");
               } catch (Throwable var10) {
                  ;
               }

               try {
                  class_136.field_1755.getAppletContext().showDocument(new URL(class_136.field_1755.getCodeBase(), var0), "_top");
                  return true;
               } catch (Exception var9) {
                  return false;
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: iq (int, int, int, int, java.lang.String, java.lang.String, int, int, int) void
   static final void method_1603(int var0, int var1, int var2, int var3, String var5, int var6, int var7, int var8) {
      try {
         if(var2 >= 2000) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var2 -= 2000;
         }

         class_40 var9;
         if(37 == var2) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_95, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntAltReversed(var1);
            var9.networkBuffer.writeShortAlt(var0);
            var9.networkBuffer.writeShortReverse(var3);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         byte var10001;
         if(var2 == 16) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_5, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShort(class_178.field_2220 * 81340013);
            var9.networkBuffer.method_185(var3);
            var9.networkBuffer.writeShort(class_189.field_2276 * 1854633345);
            var9.networkBuffer.writeShortAlt(class_154.field_1929 * -27903763 + var1);
            var9.networkBuffer.writeShort(class_243.field_2700 * 697161691 + var0);
            var9.networkBuffer.writeIntAlt(class_100.field_1172 * 1565845213);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.networkBuffer.writeByteInv(var10001);
            client.field_1463.method_4079(var9);
         }

         class_40 var10;
         class_100 var13;
         if(var2 == 47) {
            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  return;
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_33, client.field_1463.isaac, (byte)8);
               var10.networkBuffer.method_185(var3);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.writeByteInv(var10001);
               client.field_1463.method_4079(var10);
            }
         }

         class_37 var14;
         if(var2 == 58) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var14 = class_325.method_5779(var1, var0, -594011323);
            if(var14 != null) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10 = class_112.newPacket(ClientOpcode.OPCODE_0, client.field_1463.isaac, (byte)8);
               var10.networkBuffer.writeIntAltReversed(var1);
               var10.networkBuffer.method_185(539336237 * var14.field_229);
               var10.networkBuffer.writeShort(client.field_1564 * 1424616685);
               var10.networkBuffer.writeIntReverse(class_148.field_1875 * 1430642749);
               var10.networkBuffer.method_185(1683168531 * client.field_1573);
               var10.networkBuffer.writeShort(var0);
               client.field_1463.method_4079(var10);
            }
         }

         class_99 var15;
         if(var2 == 13) {
            var15 = client.field_1458[var3];
            if(var15 != null) {
               if(var8 == 594496727) {
                  return;
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_53, client.field_1463.isaac, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.writeByteAlt(var10001);
               var10.networkBuffer.writeShortAlt(var3);
               client.field_1463.method_4079(var10);
            }
         }

         int var11;
         class_37 var16;
         if(28 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_65, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntReverse(var1);
            client.field_1463.method_4079(var9);
            var16 = class_71.method_1047(var1);
            if(var16.field_221 != null) {
               if(var8 == 594496727) {
                  return;
               }

               if(var16.field_221[0][0] == 5) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var11 = var16.field_221[0][1];
                  class_282.field_3246[var11] = 1 - class_282.field_3246[var11];
                  class_147.method_3111(var11, -2096106350);
               }
            }
         }

         if(var2 == 43) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_61, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.method_185(var3);
            var9.networkBuffer.writeShortAlt(var0);
            var9.networkBuffer.writeInt(var1);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = var0 * -315663137;
         }

         if(34 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_4, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntAltReversed(var1);
            var9.networkBuffer.writeShort(var0);
            var9.networkBuffer.writeShort(var3);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         if(8 == var2) {
            var15 = client.field_1458[var3];
            if(var15 != null) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_7, client.field_1463.isaac, (byte)8);
               var10.networkBuffer.writeIntAlt(1430642749 * class_148.field_1875);
               var10.networkBuffer.writeShort(1424616685 * client.field_1564);
               var10.networkBuffer.writeShort(var3);
               var10.networkBuffer.writeShortReverse(1683168531 * client.field_1573);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.writeByteAlt(var10001);
               client.field_1463.method_4079(var10);
            }
         }

         if(var2 == 1002) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_80, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShort(var3);
            client.field_1463.method_4079(var9);
         }

         if(42 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_63, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntAlt(var1);
            var9.networkBuffer.writeShortReverse(var3);
            var9.networkBuffer.method_185(var0);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         if(var2 == 31) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_59, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntReverse(var1);
            var9.networkBuffer.writeIntAltReversed(1565845213 * class_100.field_1172);
            var9.networkBuffer.method_185(var0);
            var9.networkBuffer.writeShortReverse(var3);
            var9.networkBuffer.writeShortAlt(81340013 * class_178.field_2220);
            var9.networkBuffer.writeShortAlt(class_189.field_2276 * 1854633345);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         if(var2 == 5) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_100, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShort(var0 + 697161691 * class_243.field_2700);
            var9.networkBuffer.writeShortAlt(-27903763 * class_154.field_1929 + var1);
            var9.networkBuffer.method_145(class_145.field_1840[82]?1:0);
            var9.networkBuffer.method_185(var3);
            client.field_1463.method_4079(var9);
         }

         if(var2 == 41) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_67, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShort(var3);
            var9.networkBuffer.method_185(var0);
            var9.networkBuffer.writeIntAltReversed(var1);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         if(32 == var2) {
            if(var8 == 594496727) {
               return;
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_98, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeIntAlt(1430642749 * class_148.field_1875);
            var9.networkBuffer.method_185(1683168531 * client.field_1573);
            var9.networkBuffer.writeIntAlt(var1);
            var9.networkBuffer.writeShort(var3);
            var9.networkBuffer.method_185(var0);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = -315663137 * var0;
         }

         if(21 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_3, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShortAlt(var3);
            var9.networkBuffer.writeShortReverse(class_154.field_1929 * -27903763 + var1);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.networkBuffer.method_145(var10001);
            var9.networkBuffer.writeShortReverse(var0 + class_243.field_2700 * 697161691);
            client.field_1463.method_4079(var9);
         }

         if(30 == var2) {
            if(var8 == 594496727) {
               return;
            }

            if(null == client.field_1583) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               class_115.method_2243(var1, var0);
               client.field_1583 = class_325.method_5779(var1, var0, 985076194);
               class_254.method_4900(client.field_1583, (byte)96);
            }
         }

         if(18 == var2) {
            if(var8 == 594496727) {
               return;
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_76, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShortReverse(var3);
            var9.networkBuffer.writeByteInv(class_145.field_1840[82]?1:0);
            var9.networkBuffer.writeShortAlt(-27903763 * class_154.field_1929 + var1);
            var9.networkBuffer.writeShortReverse(697161691 * class_243.field_2700 + var0);
            client.field_1463.method_4079(var9);
         }

         if(36 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var9 = class_112.newPacket(ClientOpcode.OPCODE_101, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeInt(var1);
            var9.networkBuffer.writeShort(var3);
            var9.networkBuffer.writeShortAlt(var0);
            client.field_1463.method_4079(var9);
            client.field_1523 = 0;
            class_303.field_3395 = class_71.method_1047(var1);
            client.field_1617 = var0 * -315663137;
         }

         if(var2 == 3) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.newPacket(ClientOpcode.INTERACT_OBJECT, client.field_1463.isaac, (byte)8);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.networkBuffer.writeByteAlt(var10001);
            var9.networkBuffer.writeShortAlt(var3);
            var9.networkBuffer.writeShortReverse(697161691 * class_243.field_2700 + var0);
            var9.networkBuffer.writeShort(var1 + class_154.field_1929 * -27903763);
            client.field_1463.method_4079(var9);
         }

         if(var2 == 4) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_54, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShortReverse(class_243.field_2700 * 697161691 + var0);
            var9.networkBuffer.writeShortAlt(var3);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.networkBuffer.method_145(var10001);
            var9.networkBuffer.writeShortAlt(-27903763 * class_154.field_1929 + var1);
            client.field_1463.method_4079(var9);
         }

         if(14 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_51, client.field_1463.isaac, (byte)8);
               var10.networkBuffer.writeIntAltReversed(class_100.field_1172 * 1565845213);
               var10.networkBuffer.method_185(class_189.field_2276 * 1854633345);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.method_145(var10001);
               var10.networkBuffer.method_185(81340013 * class_178.field_2220);
               var10.networkBuffer.writeShortReverse(var3);
               client.field_1463.method_4079(var10);
            }
         }

         if(var2 == 17) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = var1 * 1551872625;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_96, client.field_1463.isaac, (byte)8);
            if(class_145.field_1840[82]) {
               if(var8 == 594496727) {
                  return;
               }

               var10001 = 1;
            } else {
               var10001 = 0;
            }

            var9.networkBuffer.method_145(var10001);
            var9.networkBuffer.writeInt(1430642749 * class_148.field_1875);
            var9.networkBuffer.writeShort(class_154.field_1929 * -27903763 + var1);
            var9.networkBuffer.writeShortAlt(1424616685 * client.field_1564);
            var9.networkBuffer.method_185(var3);
            var9.networkBuffer.writeShortReverse(var0 + class_243.field_2700 * 697161691);
            var9.networkBuffer.writeShort(1683168531 * client.field_1573);
            client.field_1463.method_4079(var9);
         }

         if(var2 == 49) {
            if(var8 == 594496727) {
               return;
            }

            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_64, client.field_1463.isaac, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.method_145(var10001);
               var10.networkBuffer.writeShortAlt(var3);
               client.field_1463.method_4079(var10);
            }
         }

         label1258: {
            if(57 != var2) {
               if(var8 == 594496727) {
                  return;
               }

               if(var2 != 1007) {
                  break label1258;
               }

               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }
            }

            var14 = class_325.method_5779(var1, var0, -283841402);
            if(null != var14) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               class_382.method_6682(var3, var1, var0, var14.field_229 * 539336237, var5, -537904006);
            }
         }

         if(var2 == 1001) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = var6 * 560058203;
            client.field_1519 = var7 * 246678685;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = 819547401 * var0;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_78, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.writeShortAlt(var0 + 697161691 * class_243.field_2700);
            var9.networkBuffer.writeByteAlt(class_145.field_1840[82]?1:0);
            var9.networkBuffer.writeShortReverse(var3);
            var9.networkBuffer.writeShortAlt(-27903763 * class_154.field_1929 + var1);
            client.field_1463.method_4079(var9);
         }

         if(var2 == 1) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            client.field_1567 = 560058203 * var6;
            client.field_1519 = 246678685 * var7;
            client.field_1521 = -1022456306;
            client.field_1645 = 0;
            client.field_1520 = var0 * 819547401;
            client.field_1562 = 1551872625 * var1;
            var9 = class_112.newPacket(ClientOpcode.OPCODE_105, client.field_1463.isaac, (byte)8);
            var9.networkBuffer.method_185(1854633345 * class_189.field_2276);
            var9.networkBuffer.writeShortAlt(var3);
            var9.networkBuffer.writeByteAlt(class_145.field_1840[82]?1:0);
            var9.networkBuffer.writeShortAlt(class_154.field_1929 * -27903763 + var1);
            var9.networkBuffer.writeIntReverse(class_100.field_1172 * 1565845213);
            var9.networkBuffer.writeShortAlt(var0 + 697161691 * class_243.field_2700);
            var9.networkBuffer.writeShortReverse(class_178.field_2220 * 81340013);
            client.field_1463.method_4079(var9);
         }

         if(23 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            if(client.field_1553) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               GameSocket.field_2401.method_4841();
            } else {
               GameSocket.field_2401.method_4755(class_115.field_1289 * 1115122599, var0, var1, true);
            }
         }

         if(46 == var2) {
            if(var8 == 594496727) {
               throw new IllegalStateException();
            }

            var13 = client.field_1605[var3];
            if(var13 != null) {
               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_52, client.field_1463.isaac, (byte)8);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.writeByteInv(var10001);
               var10.networkBuffer.writeShortReverse(var3);
               client.field_1463.method_4079(var10);
            }
         }

         if(var2 == 48) {
            var13 = client.field_1605[var3];
            if(null != var13) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = var1 * 1551872625;
               var10 = class_112.newPacket(ClientOpcode.OPCODE_30, client.field_1463.isaac, (byte)8);
               var10.networkBuffer.writeShortAlt(var3);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var10.networkBuffer.writeByte(var10001);
               client.field_1463.method_4079(var10);
            }
         }

         if(var2 == 38) {
            if(var8 != 594496727) {
               class_54.method_583(-1850055815);
               var14 = class_71.method_1047(var1);
               client.field_1570 = -302428595;
               class_178.field_2220 = 1632162661 * var0;
               class_100.field_1172 = var1 * 1093673333;
               class_189.field_2276 = var3 * 1443023489;
               class_254.method_4900(var14, (byte)36);
               client.field_1571 = class_136.method_2958(16748608) + class_299.method_5347(var3, -186522708).field_707 + class_136.method_2958(16777215);
               if(null == client.field_1571) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1571 = class_305.field_3410;
               }

            }
         } else {
            if(var2 == 45) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_82, client.field_1463.isaac, (byte)8);
                  var10.networkBuffer.writeShort(var3);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByte(var10001);
                  client.field_1463.method_4079(var10);
               }
            }

            if(50 == var2) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = var7 * 246678685;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = 1551872625 * var1;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_48, client.field_1463.isaac, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByte(var10001);
                  var10.networkBuffer.writeShortAlt(var3);
                  client.field_1463.method_4079(var10);
               }
            }

            if(1004 == var2) {
               client.field_1567 = var6 * 560058203;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               var9 = class_112.newPacket(ClientOpcode.OPCODE_74, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeShort(var3);
               client.field_1463.method_4079(var9);
            }

            if(var2 == 44) {
               if(var8 == 594496727) {
                  return;
               }

               var13 = client.field_1605[var3];
               if(null != var13) {
                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_25, client.field_1463.isaac, (byte)8);
                  var10.networkBuffer.method_185(var3);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByteInv(var10001);
                  client.field_1463.method_4079(var10);
               }
            }

            if(var2 == 9) {
               if(var8 == 594496727) {
                  return;
               }

               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     return;
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = var7 * 246678685;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_32, client.field_1463.isaac, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.method_145(var10001);
                  var10.networkBuffer.writeShort(var3);
                  client.field_1463.method_4079(var10);
               }
            }

            if(7 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var15 = client.field_1458[var3];
               if(var15 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_103, client.field_1463.isaac, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByte(var10001);
                  var10.networkBuffer.writeShortAlt(class_189.field_2276 * 1854633345);
                  var10.networkBuffer.writeIntAlt(class_100.field_1172 * 1565845213);
                  var10.networkBuffer.method_185(var3);
                  var10.networkBuffer.writeShort(class_178.field_2220 * 81340013);
                  client.field_1463.method_4079(var10);
               }
            }

            if(var2 == 29) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var9 = class_112.newPacket(ClientOpcode.OPCODE_65, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeIntReverse(var1);
               client.field_1463.method_4079(var9);
               var16 = class_71.method_1047(var1);
               if(null != var16.field_221) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(var16.field_221[0][0] == 5) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var11 = var16.field_221[0][1];
                     if(class_282.field_3246[var11] != var16.field_193[0]) {
                        if(var8 == 594496727) {
                           return;
                        }

                        class_282.field_3246[var11] = var16.field_193[0];
                        class_147.method_3111(var11, 1343156816);
                     }
                  }
               }
            }

            class_40 var17;
            if(var2 == 1003) {
               client.field_1567 = 560058203 * var6;
               client.field_1519 = 246678685 * var7;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  class_88 var18 = var15.field_1141;
                  if(var18.field_862 != null) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var18 = var18.method_1545((byte)5);
                  }

                  if(null != var18) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var17 = class_112.newPacket(ClientOpcode.OPCODE_6, client.field_1463.isaac, (byte)8);
                     var17.networkBuffer.writeShort(var18.field_857 * -2060838679);
                     client.field_1463.method_4079(var17);
                  }
               }
            }

            if(6 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.newPacket(ClientOpcode.OPCODE_93, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.method_185(var3);
               var9.networkBuffer.method_185(var1 + -27903763 * class_154.field_1929);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.networkBuffer.method_145(var10001);
               var9.networkBuffer.writeShortAlt(class_243.field_2700 * 697161691 + var0);
               client.field_1463.method_4079(var9);
            }

            if(var2 == 12) {
               var15 = client.field_1458[var3];
               if(null != var15) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = var0 * 819547401;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_29, client.field_1463.isaac, (byte)8);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        return;
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByte(var10001);
                  var10.networkBuffer.method_185(var3);
                  client.field_1463.method_4079(var10);
               }
            }

            if(var2 == 2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.newPacket(ClientOpcode.OPCODE_71, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeShort(var0 + class_243.field_2700 * 697161691);
               var9.networkBuffer.writeShortReverse(var3);
               var9.networkBuffer.writeShort(client.field_1564 * 1424616685);
               var9.networkBuffer.writeShortReverse(class_154.field_1929 * -27903763 + var1);
               var9.networkBuffer.writeShortReverse(client.field_1573 * 1683168531);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.networkBuffer.writeByteAlt(var10001);
               var9.networkBuffer.writeIntAlt(class_148.field_1875 * 1430642749);
               client.field_1463.method_4079(var9);
            }

            if(26 == var2) {
               if(var8 == 594496727) {
                  return;
               }

               class_117.method_2250((short)-23226);
            }

            label1224: {
               if(1008 != var2) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(1009 != var2) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     if(var2 != 1010 && var2 != 1011) {
                        if(var2 != 1012) {
                           break label1224;
                        }

                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               class_363 var10000 = class_287.field_3278;
               class_280 var10003 = new class_280(var0);
               class_280 var10004 = new class_280(var1);
               var10000.method_6383(var2, var3, var10003, var10004);
            }

            if(var2 == 11) {
               var15 = client.field_1458[var3];
               if(null != var15) {
                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_92, client.field_1463.isaac, (byte)8);
                  var10.networkBuffer.writeShort(var3);
                  var10.networkBuffer.writeByte(class_145.field_1840[82]?1:0);
                  client.field_1463.method_4079(var10);
               }
            }

            if(var2 == 24) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var14 = class_71.method_1047(var1);
               boolean var19 = true;
               if(-1245218361 * var14.field_207 > 0) {
                  var19 = class_72.method_1091(var14, 376048815);
               }

               if(var19) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var17 = class_112.newPacket(ClientOpcode.OPCODE_65, client.field_1463.isaac, (byte)8);
                  var17.networkBuffer.writeIntReverse(var1);
                  client.field_1463.method_4079(var17);
               }
            }

            if(var2 == 22) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = 560058203 * var6;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = 819547401 * var0;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.newPacket(ClientOpcode.OPCODE_77, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeShortAlt(var3);
               var9.networkBuffer.method_185(697161691 * class_243.field_2700 + var0);
               if(class_145.field_1840[82]) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var10001 = 1;
               } else {
                  var10001 = 0;
               }

               var9.networkBuffer.writeByteAlt(var10001);
               var9.networkBuffer.method_185(var1 + -27903763 * class_154.field_1929);
               client.field_1463.method_4079(var9);
            }

            if(39 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var9 = class_112.newPacket(ClientOpcode.OPCODE_99, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeShortAlt(var0);
               var9.networkBuffer.writeShort(var3);
               var9.networkBuffer.writeInt(var1);
               client.field_1463.method_4079(var9);
               client.field_1523 = 0;
               class_303.field_3395 = class_71.method_1047(var1);
               client.field_1617 = -315663137 * var0;
            }

            if(35 == var2) {
               var9 = class_112.newPacket(ClientOpcode.OPCODE_55, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.writeShortReverse(var3);
               var9.networkBuffer.writeIntAlt(var1);
               var9.networkBuffer.writeShortAlt(var0);
               client.field_1463.method_4079(var9);
               client.field_1523 = 0;
               class_303.field_3395 = class_71.method_1047(var1);
               client.field_1617 = -315663137 * var0;
            }

            if(var2 == 15) {
               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = var6 * 560058203;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = var1 * 1551872625;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_43, client.field_1463.isaac, (byte)8);
                  var10.networkBuffer.method_185(client.field_1573 * 1683168531);
                  var10.networkBuffer.writeShortAlt(var3);
                  var10.networkBuffer.writeInt(1430642749 * class_148.field_1875);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByteInv(var10001);
                  var10.networkBuffer.writeShortAlt(client.field_1564 * 1424616685);
                  client.field_1463.method_4079(var10);
               }
            }

            if(20 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               client.field_1567 = var6 * 560058203;
               client.field_1519 = var7 * 246678685;
               client.field_1521 = -1022456306;
               client.field_1645 = 0;
               client.field_1520 = var0 * 819547401;
               client.field_1562 = 1551872625 * var1;
               var9 = class_112.newPacket(ClientOpcode.OPCODE_62, client.field_1463.isaac, (byte)8);
               var9.networkBuffer.method_185(var3);
               var9.networkBuffer.writeShort(var0 + class_243.field_2700 * 697161691);
               var9.networkBuffer.writeByteInv(class_145.field_1840[82]?1:0);
               var9.networkBuffer.writeShortAlt(var1 + class_154.field_1929 * -27903763);
               client.field_1463.method_4079(var9);
            }

            if(51 == var2) {
               if(var8 == 594496727) {
                  throw new IllegalStateException();
               }

               var13 = client.field_1605[var3];
               if(var13 != null) {
                  if(var8 == 594496727) {
                     return;
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = 1551872625 * var1;
                  var10 = class_112.newPacket(ClientOpcode.OPCODE_102, client.field_1463.isaac, (byte)8);
                  var10.networkBuffer.writeShortReverse(var3);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var10.networkBuffer.writeByteAlt(var10001);
                  client.field_1463.method_4079(var10);
               }
            }

            if(25 == var2) {
               if(var8 != 594496727) {
                  var14 = class_325.method_5779(var1, var0, 182699028);
                  if(null != var14) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     class_54.method_583(1129864737);
                     class_162.method_3415(var1, var0, class_196.method_3989(class_112.method_2236(var14, 2136074538)), 539336237 * var14.field_229, -2141700582);
                     client.field_1570 = 0;
                     client.field_1575 = class_269.method_5039(var14, -502869844);
                     if(client.field_1575 == null) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        client.field_1575 = class_305.field_3410;
                     }

                     if(var14.field_100) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        client.field_1545 = var14.field_91 + class_136.method_2958(16777215);
                     } else {
                        client.field_1545 = class_136.method_2958('\uff00') + var14.field_225 + class_136.method_2958(16777215);
                     }
                  }

               }
            } else {
               if(40 == var2) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var9 = class_112.newPacket(ClientOpcode.OPCODE_37, client.field_1463.isaac, (byte)8);
                  var9.networkBuffer.writeShort(var0);
                  var9.networkBuffer.writeIntAltReversed(var1);
                  var9.networkBuffer.method_185(var3);
                  client.field_1463.method_4079(var9);
                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1);
                  client.field_1617 = var0 * -315663137;
               }

               if(var2 == 10) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  var15 = client.field_1458[var3];
                  if(var15 != null) {
                     if(var8 == 594496727) {
                        return;
                     }

                     client.field_1567 = var6 * 560058203;
                     client.field_1519 = var7 * 246678685;
                     client.field_1521 = -1022456306;
                     client.field_1645 = 0;
                     client.field_1520 = var0 * 819547401;
                     client.field_1562 = var1 * 1551872625;
                     var10 = class_112.newPacket(ClientOpcode.INTERACT_NPC, client.field_1463.isaac, (byte)8);
                     var10.networkBuffer.method_185(var3);
                     var10.networkBuffer.method_145(class_145.field_1840[82]?1:0);
                     client.field_1463.method_4079(var10);
                  }
               }

               if(var2 == 33) {
                  if(var8 == 594496727) {
                     return;
                  }

                  var9 = class_112.newPacket(ClientOpcode.OPCODE_13, client.field_1463.isaac, (byte)8);
                  var9.networkBuffer.writeIntAlt(var1);
                  var9.networkBuffer.writeShort(var0);
                  var9.networkBuffer.writeShortReverse(var3);
                  client.field_1463.method_4079(var9);
                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1);
                  client.field_1617 = var0 * -315663137;
               }

               if(var2 == 1005) {
                  label1193: {
                     var14 = class_71.method_1047(var1);
                     if(var14 != null) {
                        if(var8 == 594496727) {
                           throw new IllegalStateException();
                        }

                        if(var14.field_228[var0] >= 100000) {
                           if(var8 == 594496727) {
                              throw new IllegalStateException();
                           }

                           class_149.method_3135(27, "", var14.field_228[var0] + " x " + class_299.method_5347(var3, -124175090).field_707);
                           break label1193;
                        }
                     }

                     var10 = class_112.newPacket(ClientOpcode.OPCODE_74, client.field_1463.isaac, (byte)8);
                     var10.networkBuffer.writeShort(var3);
                     client.field_1463.method_4079(var10);
                  }

                  client.field_1523 = 0;
                  class_303.field_3395 = class_71.method_1047(var1);
                  client.field_1617 = -315663137 * var0;
               }

               if(var2 == 19) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  client.field_1567 = 560058203 * var6;
                  client.field_1519 = 246678685 * var7;
                  client.field_1521 = -1022456306;
                  client.field_1645 = 0;
                  client.field_1520 = 819547401 * var0;
                  client.field_1562 = 1551872625 * var1;
                  var9 = class_112.newPacket(ClientOpcode.OPCODE_87, client.field_1463.isaac, (byte)8);
                  var9.networkBuffer.writeShort(class_243.field_2700 * 697161691 + var0);
                  var9.networkBuffer.writeShortAlt(-27903763 * class_154.field_1929 + var1);
                  if(class_145.field_1840[82]) {
                     if(var8 == 594496727) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var9.networkBuffer.method_145(var10001);
                  var9.networkBuffer.writeShort(var3);
                  client.field_1463.method_4079(var9);
               }

               if(0 != -438265211 * client.field_1570) {
                  client.field_1570 = 0;
                  class_254.method_4900(class_71.method_1047(1565845213 * class_100.field_1172), (byte)85);
               }

               if(client.field_1572) {
                  if(var8 == 594496727) {
                     return;
                  }

                  class_54.method_583(980784572);
               }

               if(null != class_303.field_3395) {
                  if(var8 == 594496727) {
                     throw new IllegalStateException();
                  }

                  if(0 == client.field_1523 * -1890193251) {
                     if(var8 == 594496727) {
                        return;
                     }

                     class_254.method_4900(class_303.field_3395, (byte)95);
                  }
               }

            }
         }
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: r (int, int, boolean, byte) java.lang.String
   static String method_1604(int var0, int var1, boolean var2, byte var3) {
      try {
         if(var1 >= 2) {
            if(var3 >= -126) {
               throw new IllegalStateException();
            }

            if(var1 <= 36) {
               if(var2) {
                  if(var0 >= 0) {
                     int var4 = 2;

                     for(int var5 = var0 / var1; 0 != var5; ++var4) {
                        if(var3 >= -126) {
                           throw new IllegalStateException();
                        }

                        var5 /= var1;
                     }

                     char[] var6 = new char[var4];
                     var6[0] = 43;

                     for(int var7 = var4 - 1; var7 > 0; --var7) {
                        int var8 = var0;
                        var0 /= var1;
                        int var9 = var8 - var1 * var0;
                        if(var9 >= 10) {
                           if(var3 >= -126) {
                              throw new IllegalStateException();
                           }

                           var6[var7] = (char)(87 + var9);
                        } else {
                           var6[var7] = (char)(48 + var9);
                        }
                     }

                     return new String(var6);
                  }

                  if(var3 >= -126) {
                     throw new IllegalStateException();
                  }
               }

               return Integer.toString(var0, var1);
            }

            if(var3 >= -126) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }

   // $FF: renamed from: lv (int) void
   static void method_1605(int var0) {
      try {
         if(-400479567 * client.field_1660 == 1) {
            if(var0 <= 78996661) {
               throw new IllegalStateException();
            }

            client.field_1500 = true;
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }
}

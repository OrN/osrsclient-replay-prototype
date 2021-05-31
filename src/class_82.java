
// $FF: renamed from: eo
public class class_82 extends class_59 {

   // $FF: renamed from: n hz
   public static class_272 field_757;
   // $FF: renamed from: r int
   public int field_758;
   // $FF: renamed from: y int
   public int field_759;
   // $FF: renamed from: p boolean
   public boolean field_760;
   // $FF: renamed from: j int
   public int field_761;
   // $FF: renamed from: f int
   public int field_762;
   // $FF: renamed from: b int
   public int field_764;
   // $FF: renamed from: s int
   public int field_765;
   // $FF: renamed from: u int
   public int field_766;
   // $FF: renamed from: l int
   public int field_767;
   // $FF: renamed from: d int
   public int field_769;


   // $FF: renamed from: n (int) void
   void method_1359(int var1) {
      try {
         if(-1 != this.field_761 * 1447154143) {
            if(var1 != -593078672) {
               throw new IllegalStateException();
            }

            this.method_1362(this.field_761 * 1447154143, 273923551);
            this.field_765 = 739854473 * this.field_758;
            this.field_766 = this.field_764 * -1362031751;
            this.field_767 = 1618362335 * this.field_769;
         }

         this.method_1362(-313850043 * this.field_762, -1776601391);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (nd, int, int, int) void
   void method_1361(Buffer var1, int var2, int var4) {
      try {
         if(var2 == 1) {
            if(var4 >= 2052212375) {
               throw new IllegalStateException();
            }

            this.field_762 = var1.method_134() * -1445629043;
         } else if(var2 == 2) {
            if(var4 >= 2052212375) {
               return;
            }

            this.field_759 = var1.readUnsignedByte() * 765202977;
         } else if(var2 == 5) {
            if(var4 >= 2052212375) {
               throw new IllegalStateException();
            }

            this.field_760 = false;
         } else if(7 == var2) {
            if(var4 >= 2052212375) {
               throw new IllegalStateException();
            }

            this.field_761 = var1.method_134() * -1954076129;
         } else if(var2 == 8 && var4 >= 2052212375) {
            throw new IllegalStateException();
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (int, int) void
   void method_1362(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if(var5 < var3) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if(var7 < var9) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if(var5 > var3) {
            var11 = var5;
         }

         if(var7 > var11) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var11 + var9) / 2.0D;
         if(var9 != var11) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            if(var17 < 0.5D) {
               if(var2 >= 1730890408) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if(var17 >= 0.5D) {
               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if(var11 == var3) {
               var13 = (var5 - var7) / (var11 - var9);
            } else if(var5 == var11) {
               if(var2 >= 1730890408) {
                  throw new IllegalStateException();
               }

               var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if(var11 == var7) {
               if(var2 >= 1730890408) {
                  throw new IllegalStateException();
               }

               var13 = 4.0D + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0D;
         this.field_758 = -1065832781 * (int)(256.0D * var13);
         this.field_764 = -603571783 * (int)(256.0D * var15);
         this.field_769 = 435737939 * (int)(256.0D * var17);
         if(this.field_764 * -1490944887 < 0) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            this.field_764 = 0;
         } else if(this.field_764 * -1490944887 > 255) {
            if(var2 >= 1730890408) {
               throw new IllegalStateException();
            }

            this.field_764 = 708017991;
         }

         if(1914058459 * this.field_769 < 0) {
            this.field_769 = 0;
         } else if(1914058459 * this.field_769 > 255) {
            this.field_769 = -555975251;
         }

      } catch (RuntimeException var19) {
         throw class_223.method_4281(var19);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_757 = var10000;
   }

   // $FF: renamed from: f (nd, int, int) void
   void method_1369(Buffer var1, int var3) {
      try {
         while(true) {
            int var4 = var1.readUnsignedByte();
            if(var4 == 0) {
               if(var3 != -1052896488) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1361(var1, var4, 666748128);
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <init> () void
   class_82() {
      super();
      try {
         this.field_762 = 0;
         this.field_759 = -765202977;
         this.field_760 = true;
         this.field_761 = 1954076129;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: y (short) en[]
   static class_213[] method_1374() {
      try {
         return new class_213[]{class_213.field_2439, class_213.field_2444, class_213.field_2440};
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: fr (int) void
   static final void method_1375(int var0) {
      try {
         int var1;
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         if(0 == -400479567 * client.field_1660) {
            if(var0 <= -1781460252) {
               return;
            }

            label388: {
               var1 = class_164.field_2044.field_1077 * -130212619;
               var2 = class_164.field_2044.field_1076 * 1248597615;
               if(class_146.field_1861 * -1113352723 - var1 >= -500) {
                  if(var0 <= -1781460252) {
                     return;
                  }

                  if(class_146.field_1861 * -1113352723 - var1 <= 500) {
                     if(var0 <= -1781460252) {
                        throw new IllegalStateException();
                     }

                     if(-145310383 * class_271.field_3188 - var2 >= -500) {
                        if(var0 <= -1781460252) {
                           return;
                        }

                        if(class_271.field_3188 * -145310383 - var2 <= 500) {
                           break label388;
                        }

                        if(var0 <= -1781460252) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               class_146.field_1861 = var1 * 640290789;
               class_271.field_3188 = var2 * 921873329;
            }

            if(var1 != class_146.field_1861 * -1113352723) {
               class_146.field_1861 += (var1 - -1113352723 * class_146.field_1861) / 16 * 640290789;
            }

            if(var2 != -145310383 * class_271.field_3188) {
               if(var0 <= -1781460252) {
                  return;
               }

               class_271.field_3188 += (var2 - class_271.field_3188 * -145310383) / 16 * 921873329;
            }

            var3 = class_146.field_1861 * -1113352723 >> 7;
            var4 = class_271.field_3188 * -145310383 >> 7;
            var5 = class_205.method_4113(class_146.field_1861 * -1113352723, class_271.field_3188 * -145310383, class_115.field_1289 * 1115122599, 1598797945);
            var6 = 0;
            int var7;
            if(var3 > 3) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               if(var4 > 3 && var3 < 100) {
                  if(var0 <= -1781460252) {
                     throw new IllegalStateException();
                  }

                  if(var4 < 100) {
                     if(var0 <= -1781460252) {
                        throw new IllegalStateException();
                     }

                     for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
                        if(var0 <= -1781460252) {
                           throw new IllegalStateException();
                        }

                        for(int var8 = var4 - 4; var8 <= 4 + var4; ++var8) {
                           if(var0 <= -1781460252) {
                              throw new IllegalStateException();
                           }

                           int var9 = class_115.field_1289 * 1115122599;
                           if(var9 < 3) {
                              if(var0 <= -1781460252) {
                                 return;
                              }

                              if(2 == (class_166.field_2069[1][var7][var8] & 2)) {
                                 if(var0 <= -1781460252) {
                                    throw new IllegalStateException();
                                 }

                                 ++var9;
                              }
                           }

                           int var10 = var5 - class_166.field_2078[var9][var7][var8];
                           if(var10 > var6) {
                              if(var0 <= -1781460252) {
                                 throw new IllegalStateException();
                              }

                              var6 = var10;
                           }
                        }
                     }
                  }
               }
            }

            var7 = 192 * var6;
            if(var7 > 98048) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               var7 = 98048;
            }

            if(var7 < '\u8000') {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               var7 = '\u8000';
            }

            if(var7 > 627480141 * client.field_1503) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               client.field_1503 += (var7 - 627480141 * client.field_1503) / 24 * 99390085;
            } else if(var7 < client.field_1503 * 627480141) {
               client.field_1503 += (var7 - 627480141 * client.field_1503) / 80 * 99390085;
            }

            class_120.field_1329 = (class_205.method_4113(class_164.field_2044.field_1077 * -130212619, class_164.field_2044.field_1076 * 1248597615, class_115.field_1289 * 1115122599, 984751129) - 334319879 * client.field_1596) * 1591738677;
         } else if(1 == client.field_1660 * -400479567) {
            class_88.method_1567(-1165253281);
            short var12 = -1;
            if(class_145.field_1840[33]) {
               var12 = 0;
            } else if(class_145.field_1840[49]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               var12 = 1024;
            }

            if(class_145.field_1840[48]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               if(0 == var12) {
                  if(var0 <= -1781460252) {
                     return;
                  }

                  var12 = 1792;
               } else if(1024 == var12) {
                  var12 = 1280;
               } else {
                  var12 = 1536;
               }
            } else if(class_145.field_1840[50]) {
               if(var0 <= -1781460252) {
                  return;
               }

               if(var12 == 0) {
                  var12 = 256;
               } else if(var12 == 1024) {
                  var12 = 768;
               } else {
                  var12 = 512;
               }
            }

            byte var13 = 0;
            if(class_145.field_1840[35]) {
               if(var0 <= -1781460252) {
                  return;
               }

               var13 = -1;
            } else if(class_145.field_1840[51]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               var13 = 1;
            }

            label410: {
               var3 = 0;
               if(var12 < 0) {
                  if(var0 <= -1781460252) {
                     return;
                  }

                  if(0 == var13) {
                     break label410;
                  }

                  if(var0 <= -1781460252) {
                     throw new IllegalStateException();
                  }
               }

               int var10000;
               if(class_145.field_1840[81]) {
                  if(var0 <= -1781460252) {
                     throw new IllegalStateException();
                  }

                  var10000 = 918404705 * client.field_1420;
               } else {
                  var10000 = -503425261 * client.field_1497;
               }

               var3 = var10000;
               var3 *= 16;
               client.field_1508 = 2141754155 * var12;
               client.field_1496 = -1255933625 * var13;
            }

            if(client.field_1494 * -859124845 < var3) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               client.field_1494 += var3 / 8 * 2106657435;
               if(-859124845 * client.field_1494 > var3) {
                  client.field_1494 = 2106657435 * var3;
               }
            } else if(client.field_1494 * -859124845 > var3) {
               if(var0 <= -1781460252) {
                  return;
               }

               client.field_1494 = client.field_1494 * 857810987 / 10 * 2106657435;
            }

            if(-859124845 * client.field_1494 > 0) {
               if(var0 <= -1781460252) {
                  return;
               }

               var4 = client.field_1494 * -859124845 / 16;
               if(client.field_1508 * -1624140925 >= 0) {
                  var1 = -1624140925 * client.field_1508 - class_382.field_4208 * 611240317 & 2047;
                  var5 = class_70.field_548[var1];
                  var6 = class_70.field_559[var1];
                  class_146.field_1861 += var5 * var4 / 65536 * 640290789;
                  class_271.field_3188 += 921873329 * (var4 * var6 / 65536);
               }

               if(0 != client.field_1496 * 286253175) {
                  if(var0 <= -1781460252) {
                     throw new IllegalStateException();
                  }

                  class_120.field_1329 += client.field_1496 * 286253175 * var4 * 1591738677;
                  if(class_120.field_1329 * 769722653 > 0) {
                     if(var0 <= -1781460252) {
                        throw new IllegalStateException();
                     }

                     class_120.field_1329 = 0;
                  }
               }
            } else {
               client.field_1508 = -2141754155;
               client.field_1496 = 1255933625;
            }

            if(class_145.field_1840[13]) {
               GameMouseListener.method_2890();
            }
         }

         label413: {
            if(4 == 97210001 * GameMouseListener.field_1709) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               if(client.field_1441) {
                  if(var0 <= -1781460252) {
                     throw new IllegalStateException();
                  }

                  int var10001;
                  label349: {
                     var1 = 1903378733 * GameMouseListener.field_1703 - client.field_1415 * 1156171963;
                     client.field_1489 = var1 * -1075205514;
                     if(var1 != -1) {
                        if(var0 <= -1781460252) {
                           throw new IllegalStateException();
                        }

                        if(var1 != 1) {
                           var10001 = (1903378733 * GameMouseListener.field_1703 + 1156171963 * client.field_1415) / 2;
                           break label349;
                        }

                        if(var0 <= -1781460252) {
                           throw new IllegalStateException();
                        }
                     }

                     var10001 = 1903378733 * GameMouseListener.field_1703;
                  }

                  label342: {
                     client.field_1415 = -1134740365 * var10001;
                     var2 = -1017968913 * client.field_1490 - GameMouseListener.field_1722 * -678881683;
                     client.field_1422 = 1853327502 * var2;
                     if(-1 != var2) {
                        if(var0 <= -1781460252) {
                           throw new IllegalStateException();
                        }

                        if(var2 != 1) {
                           var10001 = (-678881683 * GameMouseListener.field_1722 + -1017968913 * client.field_1490) / 2;
                           break label342;
                        }
                     }

                     var10001 = GameMouseListener.field_1722 * -678881683;
                  }

                  client.field_1490 = 1036445711 * var10001;
                  break label413;
               }
            }

            if(class_145.field_1840[96]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               client.field_1422 += (-24 - -308632201 * client.field_1422) / 2 * 926663751;
            } else if(class_145.field_1840[97]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               client.field_1422 += 926663751 * ((24 - -308632201 * client.field_1422) / 2);
            } else {
               client.field_1422 = 926663751 * (client.field_1422 * -308632201 / 2);
            }

            if(class_145.field_1840[98]) {
               if(var0 <= -1781460252) {
                  return;
               }

               client.field_1489 += -537602757 * ((12 - client.field_1489 * -1928381453) / 2);
            } else if(class_145.field_1840[99]) {
               if(var0 <= -1781460252) {
                  throw new IllegalStateException();
               }

               client.field_1489 += (-12 - client.field_1489 * -1928381453) / 2 * -537602757;
            } else {
               client.field_1489 = -1928381453 * client.field_1489 / 2 * -537602757;
            }

            client.field_1415 = GameMouseListener.field_1703 * -1285172425;
            client.field_1490 = 782833763 * GameMouseListener.field_1722;
         }

         client.field_1629 = -559332981 * (-574530013 * client.field_1629 + -308632201 * client.field_1422 / 2 & 2047);
         client.field_1486 += client.field_1489 * -1928381453 / 2 * -955456539;
         if(client.field_1486 * -2031705619 < 128) {
            client.field_1486 = -2039352704;
         }

         if(client.field_1486 * -2031705619 > 383) {
            if(var0 <= -1781460252) {
               return;
            }

            client.field_1486 = -867634277;
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: ar (bm, short) void
   static final void method_1376(class_104 var0, short var1) {
      try {
         var0.field_1208 = false;
         if(var0.field_1205 != null) {
            if(var1 == 140) {
               throw new IllegalStateException();
            }

            var0.field_1205.field_1261 = 0;
         }

         for(class_104 var2 = var0.method_1931(); var2 != null; var2 = var0.method_1947()) {
            if(var1 == 140) {
               throw new IllegalStateException();
            }

            method_1376(var2, (short)-4868);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}

import java.io.IOException;
import java.util.zip.CRC32;

// $FF: renamed from: jx
public class class_314 {

   // $FF: renamed from: z jp[]
   public static class_307[] field_3765;
   // $FF: renamed from: n int
   public static int field_3766;
   // $FF: renamed from: y md
   public static class_364 field_3767;
   // $FF: renamed from: p int
   public static int field_3768;
   // $FF: renamed from: u md
   public static class_364 field_3769;
   // $FF: renamed from: m java.util.zip.CRC32
   public static CRC32 field_3770;
   // $FF: renamed from: v ls
   public static class_206 field_3771;
   // $FF: renamed from: w byte
   public static byte field_3772;
   // $FF: renamed from: s int
   public static int field_3773;
   // $FF: renamed from: b ka
   public static class_316 field_3774;
   // $FF: renamed from: l int
   public static int field_3775;
   // $FF: renamed from: e nd
   public static class_28 field_3776;
   // $FF: renamed from: a int
   public static int field_3777;
   // $FF: renamed from: t int
   public static int field_3778;
   // $FF: renamed from: j md
   public static class_364 field_3779;
   // $FF: renamed from: r int
   public static int field_3780;
   // $FF: renamed from: d md
   public static class_364 field_3781;
   // $FF: renamed from: h int
   public static int field_3782;
   // $FF: renamed from: dd jp
   static class_307 field_3783;


   // $FF: renamed from: o (int, int) void
   static void method_5579(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      class_60 var4 = (class_60)field_3781.method_6523(var2);
      if(null != var4) {
         field_3774.method_5610(var4);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3766 = 0;
      class_364 var10000 = new class_364(4096);
      field_3767 = var10000;
      field_3768 = 0;
      var10000 = new class_364(32);
      field_3779 = var10000;
      field_3780 = 0;
      class_316 var0 = new class_316();
      field_3774 = var0;
      var10000 = new class_364(4096);
      field_3781 = var10000;
      field_3773 = 0;
      var10000 = new class_364(4096);
      field_3769 = var10000;
      field_3775 = 0;
      class_28 var1 = new class_28(8);
      field_3776 = var1;
      field_3777 = 0;
      field_3770 = new CRC32();
      field_3765 = new class_307[256];
      field_3772 = 0;
      field_3778 = 0;
      field_3782 = 0;
   }

   // $FF: renamed from: u (jp, int, int, int, byte, boolean) void
   static void method_5581(class_307 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class_60 var8 = (class_60)field_3767.method_6523(var6);
      if(null == var8) {
         var8 = (class_60)field_3779.method_6523(var6);
         if(null == var8) {
            var8 = (class_60)field_3781.method_6523(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method_635();
                  field_3767.method_6525(var8, var6);
                  field_3773 -= 422170945;
                  field_3768 += -51966071;
               }

            } else {
               if(!var5) {
                  var8 = (class_60)field_3769.method_6523(var6);
                  if(null != var8) {
                     return;
                  }
               }

               class_60 var10000 = new class_60();
               var8 = var10000;
               var8.field_473 = var0;
               var8.field_474 = -1150578315 * var3;
               var8.field_472 = var4;
               if(var5) {
                  field_3767.method_6525(var8, var6);
                  field_3768 += -51966071;
               } else {
                  field_3774.method_5611(var8);
                  field_3781.method_6525(var8, var6);
                  field_3773 += 422170945;
               }

            }
         }
      }
   }

   // $FF: renamed from: <init> () void
   class_314() throws Throwable {
      super();
      try {
         throw new Error();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: d (jp, int) void
   static void method_5583(class_307 var0, int var1) {
      if(class_202.field_2369 != null) {
         class_202.field_2369.field_15 = var1 * 926753600 + -833490559;
         int var2 = class_202.field_2369.method_135();
         int var3 = class_202.field_2369.method_135();
         var0.method_5489(var2, var3, -887756709);
      } else {
         class_278.method_5146((class_307)null, 255, -973826600, 0, (byte)0, true, (byte)-120);
         field_3765[var1] = var0;
      }
   }

   // $FF: renamed from: s (jp, int) void
   static void method_5584(class_307 var0, int var1) {
      if(class_202.field_2369 != null) {
         class_202.field_2369.field_15 = var1 * 384402024 + -833490559;
         int var2 = class_202.field_2369.method_135();
         int var3 = class_202.field_2369.method_135();
         var0.method_5489(var2, var3, -887756709);
      } else {
         class_278.method_5146((class_307)null, 255, 255, 0, (byte)0, true, (byte)-56);
         field_3765[var1] = var0;
      }
   }

   // $FF: renamed from: r (boolean) void
   public static void method_5585(boolean var0) {
      if(field_3771 != null) {
         try {
            class_28 var10000 = new class_28(4);
            class_28 var1 = var10000;
            var1.method_210(var0?2:3);
            var1.method_115(0);
            field_3771.method_4132(var1.field_12, 0, 4);
         } catch (IOException var4) {
            try {
               field_3771.method_4123(1703282081);
            } catch (Exception var3) {
               ;
            }

            field_3782 += 447278907;
            field_3771 = null;
         }

      }
   }

   // $FF: renamed from: l (jp, int, int, int, byte, boolean) void
   static void method_5586(class_307 var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      class_60 var8 = (class_60)field_3767.method_6523(var6);
      if(null == var8) {
         var8 = (class_60)field_3779.method_6523(var6);
         if(null == var8) {
            var8 = (class_60)field_3781.method_6523(var6);
            if(var8 != null) {
               if(var5) {
                  var8.method_635();
                  field_3767.method_6525(var8, var6);
                  field_3773 -= 422170945;
                  field_3768 += -51966071;
               }

            } else {
               if(!var5) {
                  var8 = (class_60)field_3769.method_6523(var6);
                  if(null != var8) {
                     return;
                  }
               }

               class_60 var10000 = new class_60();
               var8 = var10000;
               var8.field_473 = var0;
               var8.field_474 = -1150578315 * var3;
               var8.field_472 = var4;
               if(var5) {
                  field_3767.method_6525(var8, var6);
                  field_3768 += -51966071;
               } else {
                  field_3774.method_5611(var8);
                  field_3781.method_6525(var8, var6);
                  field_3773 += 422170945;
               }

            }
         }
      }
   }

   // $FF: renamed from: gc (int, int, int, int, int) void
   static final void method_5587(int var0, int var1, int var2, int var3, int var4) {
      try {
         client.field_1504 = 0;
         boolean var5 = false;
         int var6 = -1;
         int var7 = -1;
         int var8 = class_195.field_2313 * -1143549299;
         int[] var9 = class_195.field_2318;

         int var10;
         for(var10 = 0; var10 < -1300723479 * client.field_1459 + var8; ++var10) {
            if(var4 <= 1203851302) {
               throw new IllegalStateException();
            }

            Object var11;
            if(var10 < var8) {
               if(var4 <= 1203851302) {
                  throw new IllegalStateException();
               }

               var11 = client.field_1605[var9[var10]];
               if(client.field_1544 * 845336023 == var9[var10]) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var5 = true;
                  var6 = var10;
                  continue;
               }

               if(class_164.field_2044 == var11) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var7 = var10;
                  continue;
               }
            } else {
               var11 = client.field_1458[client.field_1460[var10 - var8]];
            }

            class_342.method_6058((class_98)var11, var10, var0, var1, var2, var3, -1004493175);
         }

         if(client.field_1536 && var7 != -1) {
            class_342.method_6058(class_164.field_2044, var7, var0, var1, var2, var3, -82802445);
         }

         if(var5) {
            if(var4 <= 1203851302) {
               return;
            }

            class_342.method_6058(client.field_1605[845336023 * client.field_1544], var6, var0, var1, var2, var3, 1010632280);
         }

         for(var10 = 0; var10 < 964514413 * client.field_1504; ++var10) {
            if(var4 <= 1203851302) {
               throw new IllegalStateException();
            }

            int var21 = client.field_1515[var10];
            int var12 = client.field_1661[var10];
            int var13 = client.field_1509[var10];
            int var14 = client.field_1507[var10];
            boolean var15 = true;

            while(var15) {
               if(var4 <= 1203851302) {
                  return;
               }

               var15 = false;

               for(int var16 = 0; var16 < var10; ++var16) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  if(var12 + 2 > client.field_1661[var16] - client.field_1507[var16] && var12 - var14 < client.field_1661[var16] + 2) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     if(var21 - var13 < client.field_1515[var16] + client.field_1509[var16] && var13 + var21 > client.field_1515[var16] - client.field_1509[var16]) {
                        if(var4 <= 1203851302) {
                           throw new IllegalStateException();
                        }

                        if(client.field_1661[var16] - client.field_1507[var16] < var12) {
                           var12 = client.field_1661[var16] - client.field_1507[var16];
                           var15 = true;
                        }
                     }
                  }
               }
            }

            client.field_1434 = 164672425 * client.field_1515[var10];
            client.field_1517 = (client.field_1661[var10] = var12) * -522689307;
            String var22 = client.field_1513[var10];
            if(client.field_1664 * -234914901 == 0) {
               int var17 = 16776960;
               if(client.field_1607[var10] < 6) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var17 = client.field_1653[client.field_1607[var10]];
               }

               int var10000;
               if(client.field_1607[var10] == 6) {
                  if(-213028925 * client.field_1559 % 20 < 10) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var10000 = 16711680;
                  } else {
                     var10000 = 16776960;
                  }

                  var17 = var10000;
               }

               if(client.field_1607[var10] == 7) {
                  var17 = -213028925 * client.field_1559 % 20 < 10?255:'\uffff';
               }

               if(client.field_1607[var10] == 8) {
                  if(-213028925 * client.field_1559 % 20 < 10) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var10000 = '\ub000';
                  } else {
                     var10000 = 8454016;
                  }

                  var17 = var10000;
               }

               int var18;
               if(client.field_1607[var10] == 9) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var18 = 150 - client.field_1512[var10];
                  if(var18 < 50) {
                     if(var4 <= 1203851302) {
                        return;
                     }

                     var17 = 16711680 + 1280 * var18;
                  } else if(var18 < 100) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var17 = 16776960 - (var18 - 50) * 327680;
                  } else if(var18 < 150) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var17 = '\uff00' + (var18 - 100) * 5;
                  }
               }

               if(10 == client.field_1607[var10]) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var18 = 150 - client.field_1512[var10];
                  if(var18 < 50) {
                     var17 = 16711680 + var18 * 5;
                  } else if(var18 < 100) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var17 = 16711935 - 327680 * (var18 - 50);
                  } else if(var18 < 150) {
                     var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
                  }
               }

               if(client.field_1607[var10] == 11) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  var18 = 150 - client.field_1512[var10];
                  if(var18 < 50) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var17 = 16777215 - var18 * 327685;
                  } else if(var18 < 100) {
                     if(var4 <= 1203851302) {
                        return;
                     }

                     var17 = (var18 - 50) * 327685 + '\uff00';
                  } else if(var18 < 150) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var17 = 16777215 - 327680 * (var18 - 100);
                  }
               }

               if(client.field_1511[var10] == 0) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  class_37.field_241.method_872(var22, var0 + 1057202329 * client.field_1434, client.field_1517 * -1775322899 + var1, var17, 0);
               }

               if(1 == client.field_1511[var10]) {
                  if(var4 <= 1203851302) {
                     return;
                  }

                  class_37.field_241.method_898(var22, var0 + 1057202329 * client.field_1434, var1 + -1775322899 * client.field_1517, var17, 0, -213028925 * client.field_1559);
               }

               if(2 == client.field_1511[var10]) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  class_37.field_241.method_931(var22, client.field_1434 * 1057202329 + var0, -1775322899 * client.field_1517 + var1, var17, 0, client.field_1559 * -213028925);
               }

               if(3 == client.field_1511[var10]) {
                  if(var4 <= 1203851302) {
                     throw new IllegalStateException();
                  }

                  class_37.field_241.method_876(var22, 1057202329 * client.field_1434 + var0, var1 + -1775322899 * client.field_1517, var17, 0, -213028925 * client.field_1559, 150 - client.field_1512[var10]);
               }

               if(4 == client.field_1511[var10]) {
                  if(var4 <= 1203851302) {
                     return;
                  }

                  var18 = (150 - client.field_1512[var10]) * (class_37.field_241.method_885(var22) + 100) / 150;
                  class_65.method_679(client.field_1434 * 1057202329 + var0 - 50, var1, var0 + 1057202329 * client.field_1434 + 50, var1 + var3);
                  class_37.field_241.method_869(var22, client.field_1434 * 1057202329 + var0 + 50 - var18, -1775322899 * client.field_1517 + var1, var17, 0);
                  class_65.method_694(var0, var1, var0 + var2, var3 + var1);
               }

               if(client.field_1511[var10] == 5) {
                  if(var4 <= 1203851302) {
                     return;
                  }

                  var18 = 150 - client.field_1512[var10];
                  int var19 = 0;
                  if(var18 < 25) {
                     if(var4 <= 1203851302) {
                        throw new IllegalStateException();
                     }

                     var19 = var18 - 25;
                  } else if(var18 > 125) {
                     var19 = var18 - 125;
                  }

                  class_65.method_679(var0, var1 + client.field_1517 * -1775322899 - class_37.field_241.field_522 - 1, var2 + var0, 5 + -1775322899 * client.field_1517 + var1);
                  class_37.field_241.method_872(var22, client.field_1434 * 1057202329 + var0, var19 + var1 + client.field_1517 * -1775322899, var17, 0);
                  class_65.method_694(var0, var1, var2 + var0, var3 + var1);
               }
            } else {
               class_37.field_241.method_872(var22, 1057202329 * client.field_1434 + var0, var1 + client.field_1517 * -1775322899, 16776960, 0);
            }
         }

      } catch (RuntimeException var20) {
         throw class_223.method_4281(var20);
      }
   }

   // $FF: renamed from: c (int, int) void
   static void method_5588(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      class_60 var4 = (class_60)field_3781.method_6523(var2);
      if(null != var4) {
         field_3774.method_5610(var4);
      }
   }

   // $FF: renamed from: e (int, int) void
   static void method_5589(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      class_60 var4 = (class_60)field_3781.method_6523(var2);
      if(null != var4) {
         field_3774.method_5610(var4);
      }
   }

   // $FF: renamed from: g (int, int) int
   static int method_5590(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return class_185.field_2260 != null && var2 == class_185.field_2260.field_9?-847787153 * class_154.field_1928.field_15 / (class_154.field_1928.field_12.length - class_185.field_2260.field_472) + 1:0;
   }

   // $FF: renamed from: a (int, int) int
   static int method_5591(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return class_185.field_2260 != null && var2 == class_185.field_2260.field_9?-847787153 * class_154.field_1928.field_15 / (class_154.field_1928.field_12.length - class_185.field_2260.field_472) + 1:0;
   }

   // $FF: renamed from: k (int, int) int
   static int method_5592(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return class_185.field_2260 != null && var2 == class_185.field_2260.field_9?-847787153 * class_154.field_1928.field_15 / (class_154.field_1928.field_12.length - class_185.field_2260.field_472) + 1:0;
   }

   // $FF: renamed from: m (int, int) int
   static int method_5593(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return class_185.field_2260 != null && var2 == class_185.field_2260.field_9?-1442128191 * class_154.field_1928.field_15 / (class_154.field_1928.field_12.length - class_185.field_2260.field_472) + 1:0;
   }

   // $FF: renamed from: x (int, int) int
   static int method_5594(int var0, int var1) {
      long var2 = (long)(var1 + (var0 << 16));
      return class_185.field_2260 != null && var2 == class_185.field_2260.field_9?-847787153 * class_154.field_1928.field_15 / (class_154.field_1928.field_12.length - class_185.field_2260.field_472) + 1:0;
   }

   // $FF: renamed from: z () void
   public static void method_5595() {
      if(field_3771 != null) {
         field_3771.method_4123(1883011785);
      }

   }

   // $FF: renamed from: w () void
   public static void method_5596() {
      if(field_3771 != null) {
         field_3771.method_4123(1977542427);
      }

   }

   // $FF: renamed from: b (boolean) void
   public static void method_5597(boolean var0) {
      if(field_3771 != null) {
         try {
            class_28 var10000 = new class_28(4);
            class_28 var1 = var10000;
            var1.method_210(var0?2:3);
            var1.method_115(0);
            field_3771.method_4132(var1.field_12, 0, 4);
         } catch (IOException var4) {
            try {
               field_3771.method_4123(2095441109);
            } catch (Exception var3) {
               ;
            }

            field_3782 += 1095123345;
            field_3771 = null;
         }

      }
   }
}

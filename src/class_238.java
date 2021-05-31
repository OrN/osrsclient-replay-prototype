
// $FF: renamed from: fx
public class class_238 implements class_14 {

   // $FF: renamed from: v fx
   static final class_238 field_2646;
   // $FF: renamed from: n fx
   static final class_238 field_2647;
   // $FF: renamed from: f fx
   static final class_238 field_2648;
   // $FF: renamed from: y fx
   static final class_238 field_2649;
   // $FF: renamed from: p int
   final int field_2650;
   // $FF: renamed from: j byte
   final byte field_2651;


    // $FF: renamed from: <clinit> () void
   static {
      class_238 var10000 = new class_238(0, (byte)0);
      field_2646 = var10000;
      var10000 = new class_238(2, (byte)1);
      field_2647 = var10000;
      var10000 = new class_238(1, (byte)2);
      field_2648 = var10000;
      var10000 = new class_238(3, (byte)3);
      field_2649 = var10000;
   }

   // $FF: renamed from: n (int, byte) ej
   public static class_84 method_4598(int var0, byte var1) {
      try {
         class_84 var2 = (class_84)class_84.field_784.method_5065((long)var0);
         if(null != var2) {
            return var2;
         } else {
            byte[] var3 = class_84.field_783.method_5381(19, var0);
            class_84 var10000 = new class_84();
            var2 = var10000;
            if(var3 != null) {
               if(var1 == 9) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1410(var10001, (byte)-17);
            }

            class_84.field_784.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: <init> (int, byte) void
   class_238(int var1, byte var2) {
      super();
      try {
         this.field_2650 = var1 * -968717153;
         this.field_2651 = var2;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n () int
   public int method_49() {
      return this.field_2651;
   }

   // $FF: renamed from: v (int) int
   public int method_50() {
      try {
         return this.field_2651;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: fb (int) void
   static void method_4600(int var0) {
      try {
         client.field_1463.method_4077();
         client.field_1463.networkBuffer.offset = 0;
         client.field_1463.field_2376 = null;
         client.field_1463.field_2381 = null;
         client.field_1463.field_2382 = null;
         client.field_1463.field_2370 = null;
         client.field_1463.field_2380 = 0;
         client.field_1463.field_2379 = 0;
         client.field_1432 = 0;
         class_118.method_2255();
         client.field_1655 = 0;
         client.field_1520 = 0;

         int var1;
         for(var1 = 0; var1 < 2048; ++var1) {
            if(var0 == 602430813) {
               throw new IllegalStateException();
            }

            client.field_1605[var1] = null;
         }

         class_164.field_2044 = null;

         for(var1 = 0; var1 < client.field_1458.length; ++var1) {
            if(var0 == 602430813) {
               throw new IllegalStateException();
            }

            class_99 var2 = client.field_1458[var1];
            if(null != var2) {
               if(var0 == 602430813) {
                  throw new IllegalStateException();
               }

               var2.field_1128 = 187990533;
               var2.field_1103 = false;
            }
         }

         class_43.method_494();
         class_53.method_579(30, (byte)0);

         for(var1 = 0; var1 < 100; ++var1) {
            if(var0 == 602430813) {
               throw new IllegalStateException();
            }

            client.field_1495[var1] = true;
         }

         class_40 var4 = class_112.method_2238(class_266.field_3136, client.field_1463.isaac, (byte)8);
         var4.networkBuffer.writeByte(class_78.method_1223(702215999));
         var4.networkBuffer.writeShortReverse(646214551 * class_137.field_1766);
         var4.networkBuffer.writeShortReverse(-1538307343 * class_58.field_460);
         client.field_1463.method_4079(var4);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f () int
   public int method_51() {
      return this.field_2651;
   }

   // $FF: renamed from: v (int, java.lang.String, kk, int, int) hq
   public static class_40 method_4601(int var0, String var1, class_324 var2, int var3, int var4) {
      try {
         class_40 var5 = class_112.method_2238(class_266.field_3134, client.field_1463.isaac, (byte)8);
         var5.networkBuffer.writeByte(0);
         int var6 = var5.networkBuffer.offset * -442398587;
         var5.networkBuffer.writeByte(var0);
         String var7 = var1.toLowerCase();
         byte var8 = 0;
         if(var7.startsWith(class_305.field_3582)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 0;
            var1 = var1.substring(class_305.field_3582.length());
         } else if(var7.startsWith(class_305.field_3584)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 1;
            var1 = var1.substring(class_305.field_3584.length());
         } else if(var7.startsWith(class_305.field_3448)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 2;
            var1 = var1.substring(class_305.field_3448.length());
         } else if(var7.startsWith(class_305.field_3588)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 3;
            var1 = var1.substring(class_305.field_3588.length());
         } else if(var7.startsWith(class_305.field_3590)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 4;
            var1 = var1.substring(class_305.field_3590.length());
         } else if(var7.startsWith(class_305.field_3592)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 5;
            var1 = var1.substring(class_305.field_3592.length());
         } else if(var7.startsWith(class_305.field_3594)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 6;
            var1 = var1.substring(class_305.field_3594.length());
         } else if(var7.startsWith(class_305.field_3596)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 7;
            var1 = var1.substring(class_305.field_3596.length());
         } else if(var7.startsWith(class_305.field_3598)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 8;
            var1 = var1.substring(class_305.field_3598.length());
         } else if(var7.startsWith(class_305.field_3600)) {
            var8 = 9;
            var1 = var1.substring(class_305.field_3600.length());
         } else if(var7.startsWith(class_305.field_3602)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 10;
            var1 = var1.substring(class_305.field_3602.length());
         } else if(var7.startsWith(class_305.field_3486)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var8 = 11;
            var1 = var1.substring(class_305.field_3486.length());
         } else if(var2 != class_324.field_3815) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            if(var7.startsWith(class_305.field_3650)) {
               var8 = 0;
               var1 = var1.substring(class_305.field_3650.length());
            } else if(var7.startsWith(class_305.field_3585)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 1;
               var1 = var1.substring(class_305.field_3585.length());
            } else if(var7.startsWith(class_305.field_3587)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 2;
               var1 = var1.substring(class_305.field_3587.length());
            } else if(var7.startsWith(class_305.field_3568)) {
               var8 = 3;
               var1 = var1.substring(class_305.field_3568.length());
            } else if(var7.startsWith(class_305.field_3591)) {
               var8 = 4;
               var1 = var1.substring(class_305.field_3591.length());
            } else if(var7.startsWith(class_305.field_3604)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 5;
               var1 = var1.substring(class_305.field_3604.length());
            } else if(var7.startsWith(class_305.field_3428)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 6;
               var1 = var1.substring(class_305.field_3428.length());
            } else if(var7.startsWith(class_305.field_3402)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 7;
               var1 = var1.substring(class_305.field_3402.length());
            } else if(var7.startsWith(class_305.field_3599)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 8;
               var1 = var1.substring(class_305.field_3599.length());
            } else if(var7.startsWith(class_305.field_3601)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 9;
               var1 = var1.substring(class_305.field_3601.length());
            } else if(var7.startsWith(class_305.field_3603)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var8 = 10;
               var1 = var1.substring(class_305.field_3603.length());
            } else if(var7.startsWith(class_305.field_3605)) {
               var8 = 11;
               var1 = var1.substring(class_305.field_3605.length());
            }
         }

         var7 = var1.toLowerCase();
         byte var9 = 0;
         if(var7.startsWith(class_305.field_3698)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var9 = 1;
            var1 = var1.substring(class_305.field_3698.length());
         } else if(var7.startsWith(class_305.field_3608)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var9 = 2;
            var1 = var1.substring(class_305.field_3608.length());
         } else if(var7.startsWith(class_305.field_3610)) {
            var9 = 3;
            var1 = var1.substring(class_305.field_3610.length());
         } else if(var7.startsWith(class_305.field_3612)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var9 = 4;
            var1 = var1.substring(class_305.field_3612.length());
         } else if(var7.startsWith(class_305.field_3614)) {
            if(var4 <= 2028355503) {
               throw new IllegalStateException();
            }

            var9 = 5;
            var1 = var1.substring(class_305.field_3614.length());
         } else if(class_324.field_3815 != var2) {
            if(var7.startsWith(class_305.field_3607)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var9 = 1;
               var1 = var1.substring(class_305.field_3607.length());
            } else if(var7.startsWith(class_305.field_3648)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var9 = 2;
               var1 = var1.substring(class_305.field_3648.length());
            } else if(var7.startsWith(class_305.field_3611)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var9 = 3;
               var1 = var1.substring(class_305.field_3611.length());
            } else if(var7.startsWith(class_305.field_3613)) {
               var9 = 4;
               var1 = var1.substring(class_305.field_3613.length());
            } else if(var7.startsWith(class_305.field_3656)) {
               if(var4 <= 2028355503) {
                  throw new IllegalStateException();
               }

               var9 = 5;
               var1 = var1.substring(class_305.field_3656.length());
            }
         }

         var5.networkBuffer.writeByte(var8);
         var5.networkBuffer.writeByte(var9);
         class_86.method_1479(var5.networkBuffer, var1);
         if(var0 == class_281.field_3240.method_50()) {
            var5.networkBuffer.writeByte(var3);
         }

         var5.networkBuffer.method_317(-442398587 * var5.networkBuffer.offset - var6, -1035307288);
         return var5;
      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }
}

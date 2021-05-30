
// $FF: renamed from: p
public class class_117 extends class_111 {

   // $FF: renamed from: n java.lang.String
   String field_1297;
    // $FF: synthetic field
   final class_167 this$0;
    // $FF: renamed from: v int
   int field_1300;
    // $FF: renamed from: rk int
   static int field_1304;
   // $FF: renamed from: mf int
   static int field_1305;
   // $FF: renamed from: ng io[]
   static class_37[] field_1306;


   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1300 = var1.readInt() * 797652083;
      this.field_1297 = var1.method_139(-391631059);
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1300 = var1.readInt() * 797652083;
         this.field_1297 = var1.method_139(-391631059);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3653(82874555 * this.field_1300, this.field_1297, 1252307954);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1300 = var1.readInt() * 797652083;
      this.field_1297 = var1.method_139(-391631059);
   }

   // $FF: renamed from: kr (short) void
   static final void method_2250(short var0) {
      try {
         class_40 var1 = class_112.method_2238(class_266.field_3068, client.field_1463.field_2384, (byte)8);
         client.field_1463.method_4079(var1);

         for(class_48 var2 = (class_48)client.field_1578.method_6531(); var2 != null; var2 = (class_48)client.field_1578.method_6527()) {
            if(var0 >= 7037) {
               return;
            }

            if(1329352515 * var2.field_354 != 0) {
               if(var0 >= 7037) {
                  throw new IllegalStateException();
               }

               if(var2.field_354 * 1329352515 != 3) {
                  continue;
               }

               if(var0 >= 7037) {
                  throw new IllegalStateException();
               }
            }

            class_135.method_2943(var2, true, -905911755);
         }

         if(client.field_1583 != null) {
            if(var0 >= 7037) {
               throw new IllegalStateException();
            }

            class_254.method_4900(client.field_1583, (byte)97);
            client.field_1583 = null;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3653(946686489 * this.field_1300, this.field_1297, 1294034334);
   }

   // $FF: renamed from: <init> (f) void
   class_117(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (int, int, int, int, int) void
   static void method_2252(int var0, int var1, int var2, int var3, int var4) {
      try {
         class_49 var5 = (class_49)class_49.field_361.method_6523((long)var0);
         if(null == var5) {
            if(var4 != -402074125) {
               throw new IllegalStateException();
            }

            class_49 var10000 = new class_49();
            var5 = var10000;
            class_49.field_361.method_6525(var5, (long)var0);
         }

         if(var5.field_360.length <= var1) {
            if(var4 != -402074125) {
               return;
            }

            int[] var6 = new int[var1 + 1];
            int[] var7 = new int[var1 + 1];

            int var8;
            for(var8 = 0; var8 < var5.field_360.length; ++var8) {
               if(var4 != -402074125) {
                  throw new IllegalStateException();
               }

               var6[var8] = var5.field_360[var8];
               var7[var8] = var5.field_362[var8];
            }

            for(var8 = var5.field_360.length; var8 < var1; ++var8) {
               var6[var8] = -1;
               var7[var8] = 0;
            }

            var5.field_360 = var6;
            var5.field_362 = var7;
         }

         var5.field_360[var1] = var2;
         var5.field_362[var1] = var3;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: lx (int, int, int, boolean, int) void
   public static void method_2253(int var0, int var1, int var2, boolean var3, int var4) {
      try {
         class_40 var5 = class_112.method_2238(class_266.field_3131, client.field_1463.field_2384, (byte)8);
         var5.field_263.method_167(var1);
         int var10001;
         if(var3) {
            if(var4 <= 666059637) {
               return;
            }

            var10001 = -315190483 * client.field_1499;
         } else {
            var10001 = 0;
         }

         var5.field_263.method_116(var10001);
         var5.field_263.writeByte(var2);
         var5.field_263.method_185(var0);
         client.field_1463.method_4079(var5);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}

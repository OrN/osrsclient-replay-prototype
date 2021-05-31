
// $FF: renamed from: h
public class class_121 extends class_111 {

    // $FF: renamed from: n byte
   byte field_1332;
   // $FF: renamed from: v int
   int field_1333;
    // $FF: renamed from: u int[]
   static int[] field_1335;
    // $FF: renamed from: au client
   static client field_1337;
   // $FF: synthetic field
   final class_167 this$0;


    // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1333 = var1.readShort() * -443567941;
         this.field_1332 = var1.readByte();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1333 = var1.readShort() * -2018510919;
      this.field_1332 = var1.readByte();
   }

   // $FF: renamed from: <init> (f) void
   class_121(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1333 = 443567941;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1333 = var1.readShort() * -443567941;
      this.field_1332 = var1.readByte();
   }

   // $FF: renamed from: u (io, int, byte) void
   static final void method_2268(class_37 var0, int var1, byte var2) {
      try {
         if(null == var0.field_176) {
            if(var2 >= 8) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if(var0.field_155 == null) {
               if(var2 >= 8) {
                  throw new IllegalStateException();
               }

               var0.field_155 = new int[var0.field_176.length];
            }

            var0.field_155[var1] = Integer.MAX_VALUE;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3650(-1071704973 * this.field_1333, this.field_1332, (byte)-51);
   }

   // $FF: renamed from: v (int, int) eg
   public static class_87 method_2269(int var0, int var1) {
      try {
         class_87 var2 = (class_87)class_87.field_803.method_5065((long)var0);
         if(var2 != null) {
            if(var1 == 1829892571) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = class_87.field_802.method_5381(6, var0);
            class_87 var10000 = new class_87();
            var2 = var10000;
            var2.field_808 = 139564951 * var0;
            if(null != var3) {
               if(var1 == 1829892571) {
                  throw new IllegalStateException();
               }

               Buffer var10001 = new Buffer(var3);
               var2.method_1484(var10001, (byte)1);
            }

            var2.method_1483((byte)1);
            if(var2.field_813) {
               if(var1 == 1829892571) {
                  throw new IllegalStateException();
               }

               var2.field_818 = 0;
               var2.field_837 = false;
            }

            class_87.field_803.method_5064(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3650(-1071704973 * this.field_1333, this.field_1332, (byte)-45);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (int, int) int
   static int method_2270(int var0, int var1) {
      try {
         class_175 var2 = (class_175)class_197.field_2338.get(Integer.valueOf(var0));
         if(null == var2) {
            if(var1 == 1583989366) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return var2.method_3731();
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}


// $FF: renamed from: r
public class class_116 extends class_111 {

   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: bs java.lang.String
   static String field_1291;
   // $FF: renamed from: n int
   int field_1292;
   // $FF: renamed from: v int
   int field_1293;


    // $FF: renamed from: f (int, jv, java.lang.String, java.lang.String, int, boolean, int) void
   public static void method_2246(int var0, class_306 var1, String var2, String var3, int var4, boolean var5) {
      try {
         int var7 = var1.method_5399(var2);
         int var8 = var1.method_5400(var7, var3);
         class_26.method_100(var0, var1, var7, var8, var4, var5);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3696(this.field_1293 * -1126650753, this.field_1292 * 910283143, -2110660609);
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3696(this.field_1293 * -1126650753, this.field_1292 * 910283143, -677454143);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> (f) void
   class_116(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1293 = var1.readInt() * 231412607;
      this.field_1292 = var1.readInt() * 62071863;
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1293 = var1.readInt() * 231412607;
         this.field_1292 = var1.readInt() * 62071863;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: n (int, int) ew
   public static class_75 method_2248(int var0, int var1) {
      try {
         if(var0 >= 0) {
            if(var1 != 1647125333) {
               throw new IllegalStateException();
            }

            if(var0 < class_75.field_614.length) {
               if(var1 != 1647125333) {
                  throw new IllegalStateException();
               }

               if(null != class_75.field_614[var0]) {
                  return class_75.field_614[var0];
               }
            }
         }

         class_75 var10000 = new class_75(var0);
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1293 = var1.readInt() * -891848324;
      this.field_1292 = var1.readInt() * 62071863;
   }

   // $FF: renamed from: o (java.lang.CharSequence, int) java.lang.String
   public static String method_2249(CharSequence var0) {
      try {
         int var3 = var0.length();
         char[] var4 = new char[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = 42;
         }

         String var2 = new String(var4);
         return var2;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}

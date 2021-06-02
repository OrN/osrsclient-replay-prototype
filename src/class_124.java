
// $FF: renamed from: c
public class class_124 extends class_111 {

    // $FF: renamed from: n java.lang.String
   String field_1354;
   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: v long
   long field_1355;
    // $FF: renamed from: a io
   static class_37 field_1357;


    // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      if(var1.readUnsignedByte() != 255) {
         var1.offset -= 1884126752;
         this.field_1355 = var1.readLong() * 1174614713605796747L;
      }

      this.field_1354 = var1.method_347(-234587580);
   }

   // $FF: renamed from: fz (jp, java.lang.String, int) void
   static void method_2278(IDXFile var0) {
      try {
         class_169 var10000 = new class_169(var0);
         class_169 var3 = var10000;
         client.field_1690.add(var3);
         client.field_1692 += 928843505 * var3.field_2106;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3644(this.field_1355 * 2060700822682065955L, this.field_1354, (byte)16);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: km (io, int, int, int, int) void
   static final void method_2279(class_37 var0, int var1, int var2, int var4) {
      try {
         class_61 var5 = var0.method_409(false, -1118484531);
         if(var5 == null) {
            if(var4 == 953693548) {
               throw new IllegalStateException();
            }
         } else {
            if(-771809921 * client.field_1655 < 3) {
               class_88.field_891.method_842(var1, var2, var5.field_479 * 1279799405, -1973837741 * var5.field_477, 25, 25, -574530013 * client.field_1629, 256, var5.field_476, var5.field_478);
            } else {
               class_65.method_708(var1, var2, 0, var5.field_476, var5.field_478);
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      if(var1.readUnsignedByte() != -1160445908) {
         var1.offset -= -1017877726;
         this.field_1355 = var1.readLong() * 1174614713605796747L;
      }

      this.field_1354 = var1.method_347(-263692722);
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         if(var1.readUnsignedByte() != 255) {
            var1.offset -= -1025691571;
            this.field_1355 = var1.readLong() * 1174614713605796747L;
         }

         this.field_1354 = var1.method_347(-1422550197);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> (f) void
   class_124(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1355 = -1174614713605796747L;
         this.field_1354 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (jv, byte) void
   public static void method_2281(class_306 var0) {
      try {
         class_85.field_786 = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3644(this.field_1355 * 2060700822682065955L, this.field_1354, (byte)-60);
   }

   // $FF: renamed from: n (double, double, double) double
   public static double method_2282(double var0, double var2, double var4) {
      try {
         return GameMouseListener.method_2874((var0 - var2) / var4) / var4;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }
}


// $FF: renamed from: w
public class class_112 extends class_111 {

   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: n int
   int field_1269;
   // $FF: renamed from: f int
   int field_1270;
   // $FF: renamed from: y int
   int field_1271;
    // $FF: renamed from: qi boolean
   static boolean field_1274;
    // $FF: renamed from: v int
   int field_1276;


   // $FF: renamed from: v (nd, int) void
   void method_2231(Buffer var1, int var2) {
      try {
         this.field_1276 = var1.readShort() * -1572776343;
         this.field_1269 = var1.readInt() * 996873383;
         this.field_1270 = var1.readUnsignedByte() * 1449443731;
         this.field_1271 = var1.readUnsignedByte() * 1967648465;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3664(-1525573159 * this.field_1276, 498420381 * this.field_1269, this.field_1270 * 869142640, this.field_1271 * -461559247, -2110063672);
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3664(-1525573159 * this.field_1276, 1941525271 * this.field_1269, this.field_1270 * -948599653, this.field_1271 * -461559247, -2110063672);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(Buffer var1) {
      this.field_1276 = var1.readShort() * -1572776343;
      this.field_1269 = var1.readInt() * 996873383;
      this.field_1270 = var1.readUnsignedByte() * 1449443731;
      this.field_1271 = var1.readUnsignedByte() * 1967648465;
   }

   // $FF: renamed from: y (nd) void
   void method_2233(Buffer var1) {
      this.field_1276 = var1.readShort() * -1572776343;
      this.field_1269 = var1.readInt() * -1401787522;
      this.field_1270 = var1.readUnsignedByte() * 9205998;
      this.field_1271 = var1.readUnsignedByte() * 1967648465;
   }

   // $FF: renamed from: ks (io, int) int
   static int method_2236(class_37 var0, int var1) {
      try {
         class_32 var2 = (class_32)client.field_1623.method_6523((long)(var0.field_102 * 41180389) + ((long)(-1722455647 * var0.field_101) << 32));
         if(null != var2) {
            if(var1 <= 2130552221) {
               throw new IllegalStateException();
            } else {
               return var2.field_58;
            }
         } else {
            return var0.field_174 * -721548567;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ju (int, int) void
   static final void method_2237(int var0, int var1) {
      try {
         if(class_191.method_3957(var0, (byte)-81)) {
            class_37[] var2 = class_37.field_93[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if(var1 != 993410393) {
                  throw new IllegalStateException();
               }

               class_37 var4 = var2[var3];
               if(null == var4) {
                  if(var1 != 993410393) {
                     throw new IllegalStateException();
                  }
               } else {
                  var4.field_116 = 0;
                  var4.field_232 = 0;
               }
            }

         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: v (hs, oy, byte) hq
   public static class_40 newPacket(Opcode var0, ISAAC var1, byte var2) {
      try {
         class_40 var3;
         if(class_40.field_266 * -227614929 == 0) {
            if(var2 != 8) {
               throw new IllegalStateException();
            }

            class_40 var10000 = new class_40();
            var3 = var10000;
         } else {
            var3 = class_40.field_268[(class_40.field_266 -= 1843709903) * -227614929];
         }

         var3.field_267 = var0;
         var3.field_262 = var0.field_3153 * -1937979799;
         NetworkBuffer var10001;
         if(var3.field_262 * 1934863547 == -1) {
            if(var2 != 8) {
               throw new IllegalStateException();
            }

            var10001 = new NetworkBuffer(260);
            var3.networkBuffer = var10001;
         } else if(-2 == 1934863547 * var3.field_262) {
            var10001 = new NetworkBuffer(10000);
            var3.networkBuffer = var10001;
         } else if(var3.field_262 * 1934863547 <= 18) {
            if(var2 != 8) {
               throw new IllegalStateException();
            }

            var10001 = new NetworkBuffer(20);
            var3.networkBuffer = var10001;
         } else if(1934863547 * var3.field_262 <= 98) {
            if(var2 != 8) {
               throw new IllegalStateException();
            }

            var10001 = new NetworkBuffer(100);
            var3.networkBuffer = var10001;
         } else {
            var10001 = new NetworkBuffer(260);
            var3.networkBuffer = var10001;
         }

         var3.networkBuffer.method_354(var1);
         var3.networkBuffer.method_357(-1958588669 * var3.field_267.field_3091);
         var3.length = 0;
         return var3;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: <init> (f) void
   class_112(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1276 = 1572776343;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}

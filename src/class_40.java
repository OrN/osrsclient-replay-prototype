
// $FF: renamed from: hq
public class class_40 extends class_27 {

   // $FF: renamed from: b int
   public static final int field_261 = 10000;
   // $FF: renamed from: n int
   int field_262;
   // $FF: renamed from: f nb
   public NetworkBuffer networkBuffer;
   // $FF: renamed from: y int
   public int length;
   // $FF: renamed from: j int
   static int field_266;
   // $FF: renamed from: v hs
   ClientOpcode field_267;
   // $FF: renamed from: p hq[]
   static class_40[] field_268;
   // $FF: renamed from: hw oh[]
   static class_67[] field_270;


   // $FF: renamed from: s () void
   public void method_470() {
      if(field_266 * -227614929 < field_268.length) {
         field_268[(field_266 += 1843709903) * -227614929 - 1] = this;
      }
   }

   // $FF: renamed from: f (byte) void
   public void method_471(byte var1) {
      try {
         if(field_266 * -227614929 >= field_268.length) {
            if(var1 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            field_268[(field_266 += 1843709903) * -227614929 - 1] = this;
         }
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_268 = new class_40[300];
      field_266 = 0;
   }

   // $FF: renamed from: p (hs, oy) hq
   public static class_40 method_473(ClientOpcode var0, ISAAC var1) {
      class_40 var2;
      if(field_266 * -725708193 == 0) {
         class_40 var10000 = new class_40();
         var2 = var10000;
      } else {
         var2 = field_268[(field_266 -= 1843709903) * -227614929];
      }

      var2.field_267 = var0;
      var2.field_262 = var0.subopcode * -1937979799;
      NetworkBuffer var10001;
      if(var2.field_262 * -353849396 == -1) {
         var10001 = new NetworkBuffer(260);
         var2.networkBuffer = var10001;
      } else if(1909802584 == 1934863547 * var2.field_262) {
         var10001 = new NetworkBuffer(-629592871);
         var2.networkBuffer = var10001;
      } else if(var2.field_262 * 1934863547 <= 18) {
         var10001 = new NetworkBuffer(20);
         var2.networkBuffer = var10001;
      } else if(-27595703 * var2.field_262 <= 98) {
         var10001 = new NetworkBuffer(457994531);
         var2.networkBuffer = var10001;
      } else {
         var10001 = new NetworkBuffer(260);
         var2.networkBuffer = var10001;
      }

      var2.networkBuffer.method_354(var1);
      var2.networkBuffer.method_357(-1958588669 * var2.field_267.opcode);
      var2.length = 0;
      return var2;
   }

   // $FF: renamed from: j (hs, oy) hq
   public static class_40 method_474(ClientOpcode var0, ISAAC var1) {
      class_40 var2;
      if(field_266 * 1615295544 == 0) {
         class_40 var10000 = new class_40();
         var2 = var10000;
      } else {
         var2 = field_268[(field_266 -= -1228620447) * -227614929];
      }

      var2.field_267 = var0;
      var2.field_262 = var0.subopcode * -1937979799;
      NetworkBuffer var10001;
      if(var2.field_262 * 1934863547 == -1) {
         var10001 = new NetworkBuffer(591459580);
         var2.networkBuffer = var10001;
      } else if(-2 == -1645372153 * var2.field_262) {
         var10001 = new NetworkBuffer(10000);
         var2.networkBuffer = var10001;
      } else if(var2.field_262 * -1944320151 <= 18) {
         var10001 = new NetworkBuffer(20);
         var2.networkBuffer = var10001;
      } else if(1934863547 * var2.field_262 <= 98) {
         var10001 = new NetworkBuffer(-922060501);
         var2.networkBuffer = var10001;
      } else {
         var10001 = new NetworkBuffer(-178792389);
         var2.networkBuffer = var10001;
      }

      var2.networkBuffer.method_354(var1);
      var2.networkBuffer.method_357(-1958588669 * var2.field_267.opcode);
      var2.length = 0;
      return var2;
   }

   // $FF: renamed from: r () hq
   public static class_40 method_475() {
      class_40 var0;
      if(0 == field_266 * -227614929) {
         class_40 var10000 = new class_40();
         var0 = var10000;
      } else {
         var0 = field_268[(field_266 -= 1843709903) * -227614929];
      }

      var0.field_267 = null;
      var0.field_262 = 0;
      NetworkBuffer var10001 = new NetworkBuffer(5000);
      var0.networkBuffer = var10001;
      return var0;
   }

   // $FF: renamed from: y (hs, oy) hq
   public static class_40 method_476(ClientOpcode var0, ISAAC var1) {
      class_40 var2;
      if(field_266 * -227614929 == 0) {
         class_40 var10000 = new class_40();
         var2 = var10000;
      } else {
         var2 = field_268[(field_266 -= 1843709903) * -227614929];
      }

      var2.field_267 = var0;
      var2.field_262 = var0.subopcode * -1937979799;
      NetworkBuffer var10001;
      if(var2.field_262 * 1934863547 == -1) {
         var10001 = new NetworkBuffer(260);
         var2.networkBuffer = var10001;
      } else if(-2 == 1934863547 * var2.field_262) {
         var10001 = new NetworkBuffer(10000);
         var2.networkBuffer = var10001;
      } else if(var2.field_262 * 1934863547 <= 18) {
         var10001 = new NetworkBuffer(20);
         var2.networkBuffer = var10001;
      } else if(1934863547 * var2.field_262 <= 98) {
         var10001 = new NetworkBuffer(100);
         var2.networkBuffer = var10001;
      } else {
         var10001 = new NetworkBuffer(260);
         var2.networkBuffer = var10001;
      }

      var2.networkBuffer.method_354(var1);
      var2.networkBuffer.method_357(-1958588669 * var2.field_267.opcode);
      var2.length = 0;
      return var2;
   }

   // $FF: renamed from: v (java.lang.String[], short[], int, int, int) void
   public static void method_477(String[] var0, short[] var1, int var2, int var3, int var4) {
      try {
         if(var2 < var3) {
            if(var4 <= -1459112740) {
               return;
            }

            int var5 = (var2 + var3) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            short var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if(var4 <= -1459112740) {
                  throw new IllegalStateException();
               }

               if(var7 != null) {
                  if(var4 <= -1459112740) {
                     return;
                  }

                  if(null == var0[var9] || var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if(var4 <= -1459112740) {
                     throw new IllegalStateException();
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               short var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            method_477(var0, var1, var2, var6 - 1, -558177896);
            method_477(var0, var1, var6 + 1, var3, -335576509);
         }

      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: d () hq
   public static class_40 method_478() {
      class_40 var0;
      if(0 == field_266 * 1478816237) {
         class_40 var10000 = new class_40();
         var0 = var10000;
      } else {
         var0 = field_268[(field_266 -= 1843709903) * -227614929];
      }

      var0.field_267 = null;
      var0.field_262 = 0;
      NetworkBuffer var10001 = new NetworkBuffer(5000);
      var0.networkBuffer = var10001;
      return var0;
   }

   // $FF: renamed from: p (int, int) boolean
   public static boolean method_479(int var0, int var1) {
      try {
         boolean var10000;
         if(var0 >= class_290.field_3306.field_3309 * -2083476425) {
            if(var1 == -1848245403) {
               throw new IllegalStateException();
            }

            if(var0 <= -2083476425 * class_290.field_3288.field_3309) {
               if(var1 == -1848245403) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: b () hq
   public static class_40 method_480() {
      class_40 var0;
      if(0 == field_266 * -227614929) {
         class_40 var10000 = new class_40();
         var0 = var10000;
      } else {
         var0 = field_268[(field_266 -= 1843709903) * -227614929];
      }

      var0.field_267 = null;
      var0.field_262 = 0;
      NetworkBuffer var10001 = new NetworkBuffer(5000);
      var0.networkBuffer = var10001;
      return var0;
   }
}

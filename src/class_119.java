
// $FF: renamed from: m
public class class_119 extends class_111 {

   // $FF: renamed from: n boolean
   boolean field_1314;
   // $FF: renamed from: bj int
   public static final int field_1315 = 87;
   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: gj byte[][]
   static byte[][] field_1316;
   // $FF: renamed from: rf int
   static int field_1317;
   // $FF: renamed from: br op[]
   static class_66[] field_1318;
   // $FF: renamed from: jm io
   static class_37 field_1319;
   // $FF: renamed from: re int
   static int field_1320;
   // $FF: renamed from: v int
   int field_1321;
   // $FF: renamed from: b int
   public static int field_1322;
   // $FF: renamed from: f long
   public static long field_1323;


   // $FF: renamed from: <init> (f) void
   class_119(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
         this.field_1321 = 845800427;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "m.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(class_28 var1, int var2) {
      try {
         this.field_1321 = var1.method_132((byte)-105) * -845800427;
         boolean var10001;
         if(var1.method_130(396135653) == 1) {
            if(var2 >= -24934327) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.field_1314 = var10001;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "m.v(" + ')');
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1, byte var2) {
      try {
         var1.method_3648(-918629571 * this.field_1321, this.field_1314, (byte)2);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "m.n(" + ')');
      }
   }

   // $FF: renamed from: f (int, byte) int
   public static int method_2259(int var0, byte var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "m.f(" + ')');
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(class_28 var1) {
      this.field_1321 = var1.method_132((byte)-106) * -845800427;
      this.field_1314 = var1.method_130(2013191619) == 1;
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3648(-918629571 * this.field_1321, this.field_1314, (byte)2);
   }

   // $FF: renamed from: kn (int, int, boolean, byte) void
   static final void method_2260(int var0, int var1, boolean var2, byte var3) {
      try {
         if(client.field_1647[var0] != null) {
            if(var1 >= 0) {
               if(var3 == 2) {
                  throw new IllegalStateException();
               }

               if(var1 < client.field_1647[var0].method_501((byte)-23)) {
                  class_178 var4 = (class_178)client.field_1647[var0].field_318.get(var1);
                  class_203 var5 = client.field_1463;
                  class_40 var6 = class_112.method_2238(class_266.field_3081, var5.field_2384, (byte)8);
                  var6.field_263.method_210(4 + class_166.method_3598(var4.field_2222, 744533984), 303066737);
                  var6.field_263.method_210(var0, 303066737);
                  var6.field_263.method_333(var1, 169312247);
                  var6.field_263.method_250(var2, (short)-15310);
                  var6.field_263.method_120(var4.field_2222, -427478981);
                  var5.method_4079(var6, -1976967216);
                  return;
               }

               if(var3 == 2) {
                  throw new IllegalStateException();
               }
            }

         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "m.kn(" + ')');
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(class_28 var1) {
      this.field_1321 = var1.method_132((byte)-97) * -845800427;
      this.field_1314 = var1.method_130(-1550080700) == 1;
   }
}

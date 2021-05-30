
// $FF: renamed from: n
public class class_118 extends class_111 {

   // $FF: renamed from: v int
   int field_1307;
   // $FF: renamed from: n int
   int field_1308;
    // $FF: renamed from: f int
   int field_1310;
   // $FF: renamed from: y int
   int field_1311;
    // $FF: synthetic field
   final class_167 this$0;


    // $FF: renamed from: v (nd, int) void
   void method_2231(class_28 var1, int var2) {
      try {
         this.field_1307 = var1.method_135() * 1418693631;
         this.field_1311 = var1.method_135() * 570133141;
         this.field_1308 = var1.method_130() * -1997102297;
         this.field_1310 = var1.method_130() * 157587933;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: kf (int, int, int) void
   static final void method_2254(int var0, int var1, int var2) {
      try {
         class_44 var10000;
         if(var0 >= 0) {
            if(var2 <= -909072475) {
               throw new IllegalStateException();
            }

            var10000 = client.field_1647[var0];
         } else {
            var10000 = class_147.field_1865;
         }

         class_44 var3 = var10000;
         if(null != var3) {
            if(var2 <= -909072475) {
               throw new IllegalStateException();
            }

            if(var1 >= 0) {
               if(var2 <= -909072475) {
                  throw new IllegalStateException();
               }

               if(var1 < var3.method_501()) {
                  class_178 var4 = (class_178)var3.field_318.get(var1);
                  if(var4.field_2221 != -1) {
                     if(var2 <= -909072475) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  String var5 = var4.field_2222;
                  class_203 var6 = client.field_1463;
                  class_40 var7 = class_112.method_2238(class_266.field_3125, var6.field_2384, (byte)8);
                  var7.field_263.method_210(3 + class_166.method_3598(var5));
                  var7.field_263.method_210(var0);
                  var7.field_263.method_333(var1);
                  var7.field_263.method_120(var5);
                  var6.method_4079(var7);
                  return;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8);
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1) {
      try {
         var1.method_3651(this.field_1307 * 920679423, 1361309885 * this.field_1311, -2074698601 * this.field_1308, this.field_1310 * -1666414987, -1951488302);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd) void
   void method_2234(class_28 var1) {
      this.field_1307 = var1.method_135() * 1418693631;
      this.field_1311 = var1.method_135() * 754056836;
      this.field_1308 = var1.method_130() * -1997102297;
      this.field_1310 = var1.method_130() * 157587933;
   }

   // $FF: renamed from: y (nd) void
   void method_2233(class_28 var1) {
      this.field_1307 = var1.method_135() * 1418693631;
      this.field_1311 = var1.method_135() * 570133141;
      this.field_1308 = var1.method_130() * 1976872843;
      this.field_1310 = var1.method_130() * 157587933;
   }

   // $FF: renamed from: hq (byte) void
   static void method_2255() {
      try {
         client.field_1554 = 0;
         client.field_1553 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.method_3651(this.field_1307 * 920679423, 1361309885 * this.field_1311, -2074698601 * this.field_1308, this.field_1310 * -1666414987, 829798224);
   }

   // $FF: renamed from: <init> (f) void
   class_118(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: v (jv, jv, byte) void
   public static void method_2257(class_306 var0, class_306 var1) {
      try {
         class_78.field_669 = var0;
         class_78.field_676 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }
}

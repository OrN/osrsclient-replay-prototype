
// $FF: renamed from: g
public class class_122 extends class_111 {

   // $FF: renamed from: r int
   public static final int field_1339 = 9;
   // $FF: synthetic field
   final class_167 this$0;
   // $FF: renamed from: v java.lang.String
   String field_1340;
   // $FF: renamed from: s short[][]
   public static short[][] field_1341;
   // $FF: renamed from: j int
   public static final int field_1342 = 8;
   // $FF: renamed from: ch int
   public static final int field_1343 = 2;
   // $FF: renamed from: l int
   static int field_1344;


   // $FF: renamed from: ly (java.lang.String, byte) java.lang.String
   static String method_2271(String var0, byte var1) {
      try {
         class_292[] var2 = class_391.method_6773((byte)95);

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if(var1 != 16) {
               throw new IllegalStateException();
            }

            class_292 var4 = var2[var3];
            if(var4.field_3330 * 417414069 != -1) {
               if(var1 != 16) {
                  throw new IllegalStateException();
               }

               if(var0.startsWith(class_174.method_3729(417414069 * var4.field_3330, -1986525438))) {
                  if(var1 != 16) {
                     throw new IllegalStateException();
                  }

                  var0 = var0.substring(6 + Integer.toString(417414069 * var4.field_3330).length());
                  break;
               }
            }
         }

         return var0;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "g.ly(" + ')');
      }
   }

   // $FF: renamed from: v (nd, int) void
   void method_2231(class_28 var1, int var2) {
      try {
         this.field_1340 = var1.method_139(-391631059);
         var1.method_135((byte)-28);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "g.v(" + ')');
      }
   }

   // $FF: renamed from: n (l, byte) void
   void method_2232(class_171 var1, byte var2) {
      try {
         var1.field_2134 = this.field_1340;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "g.n(" + ')');
      }
   }

   // $FF: renamed from: <init> (f) void
   class_122(class_167 var1) {
      super();
      try {
         this.this$0 = var1;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "g.<init>(" + ')');
      }
   }

   // $FF: renamed from: y (nd) void
   void method_2233(class_28 var1) {
      this.field_1340 = var1.method_139(-391631059);
      var1.method_135((byte)-67);
   }

   // $FF: renamed from: f (nd) void
   void method_2234(class_28 var1) {
      this.field_1340 = var1.method_139(-391631059);
      var1.method_135((byte)-31);
   }

   // $FF: renamed from: p (l) void
   void method_2230(class_171 var1) {
      var1.field_2134 = this.field_1340;
   }

   // $FF: renamed from: ff (int, int) void
   static final void method_2273(int var0, int var1) {
      try {
         class_56.method_589((byte)-93);
         switch(var0) {
         case 1:
            class_232.method_4451(-1934362980);
            break;
         case 2:
            class_222.method_4275((byte)1);
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "g.ff(" + ')');
      }
   }

   // $FF: renamed from: ir (short) void
   static void method_2274(short var0) {
      try {
         class_58.method_633(1498703923 * class_132.field_1731 / 2 + 1812999285 * class_111.field_1267, class_287.field_3277 * -334285379, 1078000601);
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "g.ir(" + ')');
      }
   }
}

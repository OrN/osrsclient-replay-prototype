
// $FF: renamed from: e
public abstract class class_111 extends class_27 {

   // $FF: renamed from: lc int
   static int field_1267;


    // $FF: renamed from: p (l) void
   abstract void method_2230(class_171 var1);

   // $FF: renamed from: v (nd, int) void
   abstract void method_2231(class_28 var1, int var2);

   // $FF: renamed from: <init> () void
   class_111() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: n (l, byte) void
   abstract void method_2232(class_171 var1);

   // $FF: renamed from: y (nd) void
   abstract void method_2233(class_28 var1);

   // $FF: renamed from: f (nd) void
   abstract void method_2234(class_28 var1);

   // $FF: renamed from: v (char, byte) boolean
   public static final boolean method_2235(char var0, byte var1) {
      try {
         if(Character.isISOControl(var0)) {
            if(var1 >= 8) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if(class_177.method_3795(var0, 1338737271)) {
            if(var1 >= 8) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            char[] var2 = class_381.field_4205;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2.length; ++var3) {
               if(var1 >= 8) {
                  throw new IllegalStateException();
               }

               var4 = var2[var3];
               if(var0 == var4) {
                  if(var1 >= 8) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            var2 = class_381.field_4206;

            for(var3 = 0; var3 < var2.length; ++var3) {
               var4 = var2[var3];
               if(var0 == var4) {
                  if(var1 >= 8) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}

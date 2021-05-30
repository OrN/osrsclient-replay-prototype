
// $FF: renamed from: fv
public class class_237 {

   // $FF: renamed from: n int
   int field_2640;
   // $FF: renamed from: f int
   int field_2641;
   // $FF: renamed from: v java.lang.String
   String field_2642;
   // $FF: renamed from: y fp
   class_232 field_2643;


    // $FF: renamed from: y (byte[], int, int, int, int, fz[], int) void
   static final void method_4595(byte[] var0, int var1, int var2, int var3, int var4, class_240[] var5, int var6) {
      try {
         int var8;
         int var9;
         for(int var7 = 0; var7 < 4; ++var7) {
            for(var8 = 0; var8 < 64; ++var8) {
               for(var9 = 0; var9 < 64; ++var9) {
                  if(var1 + var8 > 0) {
                     if(var6 != 1162395561) {
                        throw new IllegalStateException();
                     }

                     if(var1 + var8 < 103) {
                        if(var6 != 1162395561) {
                           throw new IllegalStateException();
                        }

                        if(var2 + var9 > 0 && var9 + var2 < 103) {
                           if(var6 != 1162395561) {
                              throw new IllegalStateException();
                           }

                           var5[var7].field_2679[var1 + var8][var9 + var2] &= -16777217;
                        }
                     }
                  }
               }
            }
         }

         Buffer var10000 = new Buffer(var0);
         Buffer var12 = var10000;

         for(var8 = 0; var8 < 4; ++var8) {
            if(var6 != 1162395561) {
               throw new IllegalStateException();
            }

            for(var9 = 0; var9 < 64; ++var9) {
               if(var6 != 1162395561) {
                  throw new IllegalStateException();
               }

               for(int var10 = 0; var10 < 64; ++var10) {
                  class_231.method_4435(var12, var8, var1 + var9, var2 + var10, var3, var4, 0, (byte)50);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11);
      }
   }

   // $FF: renamed from: <init> (java.lang.String, int, int, fp) void
   class_237(String var1, int var2, int var3, class_232 var4) {
      super();
      try {
         this.field_2642 = var1;
         this.field_2640 = var2 * 596341667;
         this.field_2641 = var3 * 718860175;
         this.field_2643 = var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }
}

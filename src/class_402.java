
// $FF: renamed from: ou
public class class_402 {

   // $FF: renamed from: as int
   static final int field_4273 = 37;
   // $FF: renamed from: v int[]
   int[] field_4274;


   // $FF: renamed from: <init> (int[]) void
   public class_402(int[] var1) {
      super();
      try {
         int var2;
         for(var2 = 1; var2 <= var1.length + (var1.length >> 1); var2 <<= 1) {
            ;
         }

         this.field_4274 = new int[var2 + var2];

         int var3;
         for(var3 = 0; var3 < var2 + var2; ++var3) {
            this.field_4274[var3] = -1;
         }

         int var4;
         for(var3 = 0; var3 < var1.length; this.field_4274[1 + var4 + var4] = var3++) {
            for(var4 = var1[var3] & var2 - 1; this.field_4274[var4 + var4 + 1] != -1; var4 = var4 + 1 & var2 - 1) {
               ;
            }

            this.field_4274[var4 + var4] = var1[var3];
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ou.<init>(" + ')');
      }
   }

   // $FF: renamed from: v (int, int) int
   public int method_6808(int var1, int var2) {
      try {
         int var3 = (this.field_4274.length >> 1) - 1;
         int var4 = var1 & var3;

         while(true) {
            int var5 = this.field_4274[1 + var4 + var4];
            if(var5 == -1) {
               if(var2 != -2076070335) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            }

            if(this.field_4274[var4 + var4] == var1) {
               if(var2 != -2076070335) {
                  throw new IllegalStateException();
               }

               return var5;
            }

            var4 = 1 + var4 & var3;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ou.v(" + ')');
      }
   }
}

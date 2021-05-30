
// $FF: renamed from: it
public class class_61 extends class_59 {

   // $FF: renamed from: y int[]
   public final int[] field_476;
   // $FF: renamed from: n int
   public final int field_477;
   // $FF: renamed from: f int[]
   public final int[] field_478;
   // $FF: renamed from: v int
   public final int field_479;
   // $FF: renamed from: s jv
   public static class_306 field_480;


   // $FF: renamed from: v (int, int, int) boolean
   public boolean method_639(int var1, int var2, int var3) {
      try {
         if(var2 >= 0) {
            if(var3 >= -996802769) {
               throw new IllegalStateException();
            }

            if(var2 < this.field_476.length) {
               if(var3 >= -996802769) {
                  throw new IllegalStateException();
               }

               int var4 = this.field_476[var2];
               if(var1 >= var4) {
                  if(var3 >= -996802769) {
                     throw new IllegalStateException();
                  }

                  if(var1 <= this.field_478[var2] + var4) {
                     return true;
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "it.v(" + ')');
      }
   }

   // $FF: renamed from: f (int, int) boolean
   public boolean method_640(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field_476.length) {
         int var3 = this.field_476[var2];
         if(var1 >= var3 && var1 <= this.field_478[var2] + var3) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: n (int, int) boolean
   public boolean method_641(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field_476.length) {
         int var3 = this.field_476[var2];
         if(var1 >= var3 && var1 <= this.field_478[var2] + var3) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: <init> (int, int, int[], int[], int) void
   void method_642(int var1, int var2, int[] var3, int[] var4, int var5) {
      try {
         super.method_105();
         this.field_479 = var1 * 1644910949;
         this.field_477 = -286940197 * var2;
         this.field_478 = var3;
         this.field_476 = var4;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "it.<init>(" + ')');
      }
   }

   // $FF: renamed from: y (int, int) boolean
   public boolean method_643(int var1, int var2) {
      if(var2 >= 0 && var2 < this.field_476.length) {
         int var3 = this.field_476[var2];
         if(var1 >= var3 && var1 <= this.field_478[var2] + var3) {
            return true;
         }
      }

      return false;
   }
}

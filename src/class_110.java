
// $FF: renamed from: au
public class class_110 extends class_109 {

   // $FF: renamed from: v int
   public int field_1262;
   // $FF: renamed from: p boolean
   public boolean field_1263;
   // $FF: renamed from: f int
   public int field_1264;
   // $FF: renamed from: y int
   int field_1265;
   // $FF: renamed from: n byte[]
   public byte[] field_1266;


   // $FF: renamed from: <init> (int, byte[], int, int) void
   class_110(int var1, byte[] var2, int var3, int var4) {
      super();
      this.field_1262 = var1;
      this.field_1266 = var2;
      this.field_1264 = var3;
      this.field_1265 = var4;
   }

   // $FF: renamed from: <init> (int, byte[], int, int, boolean) void
   class_110(int var1, byte[] var2, int var3, int var4, boolean var5) {
      super();
      this.field_1262 = var1;
      this.field_1266 = var2;
      this.field_1264 = var3;
      this.field_1265 = var4;
      this.field_1263 = var5;
   }

   // $FF: renamed from: v (be) au
   public class_110 method_2225(class_148 var1) {
      this.field_1266 = var1.method_3114(this.field_1266, 25186157);
      this.field_1262 = var1.method_3115(this.field_1262, -202023878);
      if(this.field_1264 == this.field_1265) {
         this.field_1264 = this.field_1265 = var1.method_3116(this.field_1264, 1042913417);
      } else {
         this.field_1264 = var1.method_3116(this.field_1264, 2105265204);
         this.field_1265 = var1.method_3116(this.field_1265, 1259679031);
         if(this.field_1264 == this.field_1265) {
            --this.field_1264;
         }
      }

      return this;
   }

}

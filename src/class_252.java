
// $FF: renamed from: gu
public class class_252 {

   // $FF: renamed from: y int[]
   static int[] field_2849;
   // $FF: renamed from: n int[]
   static int[] field_2850;
   // $FF: renamed from: f int[]
   static int[] field_2851;
   // $FF: renamed from: p ge
   class_43 field_2852;
   // $FF: renamed from: r int[]
   int[] field_2853;
   // $FF: renamed from: v int[]
   static int[] field_2854;
   // $FF: renamed from: j int
   int field_2855;
   // $FF: renamed from: b int[]
   int[] field_2856;
   // $FF: renamed from: d int[]
   int[] field_2857;
   // $FF: renamed from: s int[]
   int[] field_2858;
   // $FF: renamed from: u boolean
   boolean field_2859;


   // $FF: renamed from: <clinit> () void
   static {
      field_2854 = new int[500];
      field_2850 = new int[500];
      field_2851 = new int[500];
      field_2849 = new int[500];
   }

   // $FF: renamed from: <init> (byte[], ge) void
   class_252(byte[] var1, class_43 var2) {
      super();
      this.field_2852 = null;
      this.field_2855 = -1;
      this.field_2859 = false;
      this.field_2852 = var2;
      class_28 var10000 = new class_28(var1);
      class_28 var3 = var10000;
      var10000 = new class_28(var1);
      class_28 var4 = var10000;
      var3.field_15 = -2051383142;
      int var5 = var3.method_130(1984145292);
      int var6 = -1;
      int var7 = 0;
      var4.field_15 = (var3.field_15 * -442398587 + var5) * -1025691571;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method_130(-1015093870);
         if(var9 > 0) {
            if(this.field_2852.field_312[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if(this.field_2852.field_312[var10] == 0) {
                     field_2854[var7] = var10;
                     field_2850[var7] = 0;
                     field_2851[var7] = 0;
                     field_2849[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field_2854[var7] = var8;
            short var11 = 0;
            if(this.field_2852.field_312[var8] == 3) {
               var11 = 128;
            }

            if((var9 & 1) != 0) {
               field_2850[var7] = var4.method_143((byte)43);
            } else {
               field_2850[var7] = var11;
            }

            if((var9 & 2) != 0) {
               field_2851[var7] = var4.method_143((byte)65);
            } else {
               field_2851[var7] = var11;
            }

            if((var9 & 4) != 0) {
               field_2849[var7] = var4.method_143((byte)46);
            } else {
               field_2849[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if(this.field_2852.field_312[var8] == 5) {
               this.field_2859 = true;
            }
         }
      }

      if(var4.field_15 * -442398587 != var1.length) {
         throw new RuntimeException();
      } else {
         this.field_2855 = var7;
         this.field_2853 = new int[var7];
         this.field_2856 = new int[var7];
         this.field_2857 = new int[var7];
         this.field_2858 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field_2853[var8] = field_2854[var8];
            this.field_2856[var8] = field_2850[var8];
            this.field_2857[var8] = field_2851[var8];
            this.field_2858[var8] = field_2849[var8];
         }

      }
   }
}


// $FF: renamed from: bz
public class class_161 {

   // $FF: renamed from: n int
   int field_2002;
   // $FF: renamed from: v int
   int field_2003;
   // $FF: renamed from: f int[]
   int[] field_2004;
   // $FF: renamed from: y int[]
   int[] field_2005;


   // $FF: renamed from: <init> () void
   class_161() {
      super();
      class_57.method_599(16);
      this.field_2003 = class_57.method_596() != 0?class_57.method_599(4) + 1:1;
      if(class_57.method_596() != 0) {
         class_57.method_599(8);
      }

      class_57.method_599(2);
      if(this.field_2003 > 1) {
         this.field_2002 = class_57.method_599(4);
      }

      this.field_2004 = new int[this.field_2003];
      this.field_2005 = new int[this.field_2003];

      for(int var1 = 0; var1 < this.field_2003; ++var1) {
         class_57.method_599(8);
         this.field_2004[var1] = class_57.method_599(8);
         this.field_2005[var1] = class_57.method_599(8);
      }

   }
}

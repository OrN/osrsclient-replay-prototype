
// $FF: renamed from: bt
public class class_156 {

   // $FF: renamed from: b int
   int field_1941;
   // $FF: renamed from: n int[]
   int[] field_1942;
   // $FF: renamed from: f int[]
   int[] field_1943;
   // $FF: renamed from: p int
   int field_1944;
   // $FF: renamed from: u int
   int field_1945;
   // $FF: renamed from: r int
   int field_1946;
   // $FF: renamed from: v int
   int field_1947;
   // $FF: renamed from: d int
   int field_1948;
   // $FF: renamed from: j int
   int field_1949;
   // $FF: renamed from: y int
   int field_1950;
   // $FF: renamed from: s int
   int field_1951;


    // $FF: renamed from: v (nd) void
   final void method_3264(Buffer var1) {
      this.field_1946 = var1.readUnsignedByte();
      this.field_1944 = var1.method_135();
      this.field_1949 = var1.method_135();
      this.method_3277(var1);
   }

   // $FF: renamed from: <init> () void
   class_156() {
      super();
      this.field_1947 = 2;
      this.field_1942 = new int[2];
      this.field_1943 = new int[2];
      this.field_1942[0] = 0;
      this.field_1942[1] = '\uffff';
      this.field_1943[0] = 0;
      this.field_1943[1] = '\uffff';
   }

   // $FF: renamed from: f () void
   final void method_3266() {
      this.field_1941 = 0;
      this.field_1948 = 0;
      this.field_1951 = 0;
      this.field_1945 = 0;
      this.field_1950 = 0;
   }

   // $FF: renamed from: y (int) int
   final int method_3267(int var1) {
      if(this.field_1950 >= this.field_1941) {
         this.field_1945 = this.field_1943[this.field_1948++] << 15;
         if(this.field_1948 >= this.field_1947) {
            this.field_1948 = this.field_1947 - 1;
         }

         this.field_1941 = (int)((double)this.field_1942[this.field_1948] / 65536.0D * (double)var1);
         if(this.field_1941 > this.field_1950) {
            this.field_1951 = ((this.field_1943[this.field_1948] << 15) - this.field_1945) / (this.field_1941 - this.field_1950);
         }
      }

      this.field_1945 += this.field_1951;
      ++this.field_1950;
      return this.field_1945 - this.field_1951 >> 15;
   }

    // $FF: renamed from: n (nd) void
   final void method_3277(Buffer var1) {
      this.field_1947 = var1.readUnsignedByte();
      this.field_1942 = new int[this.field_1947];
      this.field_1943 = new int[this.field_1947];

      for(int var2 = 0; var2 < this.field_1947; ++var2) {
         this.field_1942[var2] = var1.readShort();
         this.field_1943[var2] = var1.readShort();
      }

   }

}

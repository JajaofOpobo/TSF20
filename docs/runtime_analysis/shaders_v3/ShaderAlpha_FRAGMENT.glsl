precision mediump float;      
varying vec2 vTextureCoord;      
uniform sampler2D sTexture;      
varying float vAlpha;      
void main() {      
 gl_FragColor = vAlpha*texture2D(sTexture, vTextureCoord);      
}